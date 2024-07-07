package steamfake.utils;

import steamfake.model.Account;

public class SessionManager {

    public static Account user = null;

    public static boolean isLogin() {
        return user != null;
    }

    public static void logOut() {
        user = null;
    }

}
