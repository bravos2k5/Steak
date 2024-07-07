package steamfake.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class XSecurity {

    public static String hashPassword(String originPassword) {
        return BCrypt.hashpw(originPassword,BCrypt.gensalt());
    }

    public static boolean isValidPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password,hashedPassword);
    }

}
