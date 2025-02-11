package steamfake.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.sun.jna.platform.FileUtils;
import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.model.PendingGame;
import steamfake.utils.azure.AzureBlobService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ResourceManager {

    private final static String GAME_RESOURCE_PATH = "data/games/";
    private final static String AVATAR_RESOURCE_PATH = "data/avatars/";

    public static void downloadAvatarGameOnly(Game game) {
        String azurePath = game.getId() + "/" + game.getVersion() + "/images/" + game.getAvatar();
        String localPath = GAME_RESOURCE_PATH + "/" + azurePath;
        if(!new File(localPath).exists()) {
            AzureBlobService.download(localPath,azurePath,"games");
        }
    }

    public static void downloadGameResource(Game game) {
        String azurePath = game.getId() + "/" + game.getVersion() + "/images/";
        String localPath = GAME_RESOURCE_PATH + azurePath;
        List<String> images = XJson.fromJson(game.getImages(), new TypeReference<>() {});
        if (images != null && game.getAvatar() != null) {
            images.add(game.getAvatar());
            for (String image : images) {
                String azureImage = azurePath + image;
                String localImage = localPath + image;
                if (!new File(localImage).exists()) {
                    AzureBlobService.download(localImage, azureImage, "games");
                }
            }
        }
    }

    public static void downloadGameResource(PendingGame game) {
        String azurePath = game.getGameID() + "/" + game.getVersion() + "/images/";
        String localPath = GAME_RESOURCE_PATH + azurePath;
        List<String> images = XJson.fromJson(game.getImages(), new TypeReference<>() {});
        if (images != null && game.getAvatar() != null) {
            images.add(game.getAvatar());
            for (String image : images) {
                String azureImage = azurePath + image;
                String localImage = localPath + image;
                if (!new File(localImage).exists()) {
                    AzureBlobService.download(localImage, azureImage, "games");
                }
            }
        }
    }

    public static void downloadAvatar(Account account) {
        String azurePath = "avatars/" + account.getId() + "/" + account.getAvatar();
        String localPath = AVATAR_RESOURCE_PATH + account.getId() + "/" + account.getAvatar();
        if(!new File(localPath).exists()) {
            AzureBlobService.download(localPath,azurePath,"images");
        }
    }



    public static void deleteOldVersionResource(Game game) {
        String azurePath = game.getId() + "/" + game.getVersion() + "/";
        String localPath = GAME_RESOURCE_PATH + azurePath;
        new File(localPath).deleteOnExit();
        AzureBlobService.deleteManyFile(azurePath,"games");
    }

    public static void clearCache() {
        if (new File("data").exists()) {
            try {
                FileUtils.getInstance().moveToTrash(new File("data"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
