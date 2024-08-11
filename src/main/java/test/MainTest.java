package test;

import steamfake.dao.GameDAO;
import steamfake.model.Game;
import steamfake.utils.XFile;
import steamfake.utils.XJson;
import steamfake.utils.azure.AzureBlobService;
import steamfake.utils.database.XJdbc;

import java.io.File;
import java.util.*;

public class MainTest {

    private static int updateImageGame(Game game) {
        String sql = "UPDATE Game " +
                     "SET " +
                     "images = ?," +
                     "avatar = ?," +
                     "exec_file = ?" +
                     "WHERE id = ?";
        return XJdbc.update(sql,game.getImages(),game.getAvatar(),game.getExecPath(),game.getId());
    }

    private static void uploadResource(Game game, List<String> localImages, String avatarLocal, String folderGame) {
        localImages.add(avatarLocal);
        new File("data/temp/game.zip").delete();
        new File("data/temp").mkdirs();
        XFile.zipFolder(folderGame,"data/temp/game.zip");
        AzureBlobService.upload("data/temp/game.zip",game.getId() + "/" + game.getVersion() + "/game.zip","games");
        for (String imagePath : localImages) {
            AzureBlobService.upload(imagePath,game.getId() + "/" + game.getVersion() + "/images/" +
                    imagePath.substring(imagePath.lastIndexOf("\\") + 1),"games");
        }
    }

    public static void main(String[] args) {
        List<Game> gameList = GameDAO.gI().selectAll();
        File[] images = new File("D:\\TestCase\\Image").listFiles();
        File[] avatars = new File("D:\\TestCase\\Avatar").listFiles();
        File[] games = new File("C:\\Program Files (x86)\\GameVui.com").listFiles();
        Arrays.sort(games, Comparator.comparing(file -> file.getName().length()));

        if (images != null && avatars != null) {
            int imagesLength = images.length;
            int avatarIndex = 0;
            int gameIndex = 0;
            int count = 1;
            for(Game game : gameList) {
                if(game.getAvatar() == null || game.getAvatar().isBlank()) {
                    List<String> imgListData = new ArrayList<>();
                    List<String> imgListLocal = new ArrayList<>();
                    int quantityImage = 0;
                    if(avatarIndex == avatars.length) {
                        avatarIndex = 0;
                    }
                    if(gameIndex == games.length) {
                        gameIndex = 0;
                    }
                    game.setAvatar(avatars[avatarIndex].getName());
                    game.setExecPath("Songoku " + (gameIndex + 1) + "/GAME-SONGOKU-" + (gameIndex + 1) + ".exe");
                    while (quantityImage < 6) {
                        int random = new Random().nextInt(imagesLength);
                        String imgName = null;
                        if (random < images.length) {
                            imgName = images[random].getName();
                            if(!imgListData.contains(imgName)) {
                                imgListData.add(imgName);
                                imgListLocal.add(images[random].getAbsolutePath());
                                quantityImage++;
                            }
                        }
                    }
                    game.setImages(XJson.toJson(imgListData));
                    if (updateImageGame(game) > 0) {
                        System.out.println("Đang upload resource...");
                    }
                    uploadResource(game,imgListLocal,avatars[avatarIndex].getAbsolutePath(),games[gameIndex].getAbsolutePath());
                    System.out.println("Hoàn thành " + count);
                    ++avatarIndex;
                    ++gameIndex;
                    ++count;
                }
            }
        }
    }


}
