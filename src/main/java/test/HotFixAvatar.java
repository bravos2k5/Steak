package test;

import steamfake.dao.GameDAO;
import steamfake.model.Game;
import steamfake.utils.azure.AzureBlobService;

import java.util.List;
import java.util.UUID;

public class HotFixAvatar {

    private static void uploadAvatar(Game game, String localAvatar) {
        AzureBlobService.upload(localAvatar,game.getId() + "/" + game.getVersion() + "/images/" +
                localAvatar.substring(localAvatar.lastIndexOf("\\") + 1),"games");
    }

    public static void main(String[] args) {
        List<Game> gameList = GameDAO.gI().selectAll();
        List<UUID> except = List.of(
                UUID.fromString("EC6DA61F-FAD3-4CCA-BC47-0146BBC4346A"),
                UUID.fromString("C3EEEE55-65E3-4584-B213-4657F8670B17"),
                UUID.fromString("0667567C-1945-4784-8BDC-B964C2254C71"),
                UUID.fromString("159D4193-98BF-428D-9A6A-2EC14406E1FE")
        );
        int count = 1;
        for(Game game : gameList) {
            if (!except.contains(game.getId())) {
                uploadAvatar(game,"D:\\TestCase\\Avatar\\" + game.getAvatar());
                System.out.println("Complete " + count + "/" + 102);
                ++count;
            }
        }
    }

}
