package steamfake.constance;

import steamfake.model.Account;
import steamfake.model.Game;

public class FilePath {

    public static String getLocalAvatarPath(Account account) {
        return "data/images/avatar/" + account.getId() + "/" + account.getAvatar();
    }

    public static String getRemoteAvatarPath(Account account) {
        return "avatar/" + account.getId() + "/" + account.getAvatar();
    }

    public static String getLocalGamePath(Game game) {
        return "data/games/" + game.getId() + "/" + game.getExecPath();
    }

    public static String getRemoteGamePath(Game game) {
        return "games/" + game.getId() + "/" + game.getVersion();
    }



}
