package steamfake.utils;

import steamfake.model.Game;
import steamfake.view.download.DownloadQueue;

import java.io.File;
import java.io.IOException;

public class GameChecker {

    public static void decide(Game game) {
        String execPath = "games/" + game.getId() + "/" + game.getVersion() + "/" + game.getExecPath();
        if(new File(execPath).exists()) {
            play(execPath);
        } else {
            download(game);
        }
    }

    private static void play(String execPath) {
        try {
            XFile.runExeFile(execPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void download(Game game) {
        DownloadQueue.gI().addNewDownload(game);
        DownloadQueue.gI().setVisible(true);
    }

}
