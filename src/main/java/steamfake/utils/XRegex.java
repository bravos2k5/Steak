package steamfake.utils;

public class XRegex {

    public static final int HARD = 3;
    public static final int MEDIUM = 2;
    public static final int EASY = 1;
    public static final int CANT_USE = 0;

    /**
     * Độ mạnh của mật khẩu
     * @param password mật khẩu cần check
     * @return độ mạnh mật khẩu
     */
    public static int checkPassword(String password) {

        String regexEasy = ".{6,}";
        String regexMedium = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        String regexHard = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{10,}$";
        if (password.matches(regexHard)) {
            return HARD;
        }
        if (password.matches(regexMedium)) {
            return MEDIUM;
        }
        if (password.matches(regexEasy)) {
            return EASY;
        }
        return CANT_USE;
    }

    public static boolean isPhone(String phone) {
        String regex = "^(?:\\+\\d{1,14}|\\d{1,14})$";
        return phone.matches(regex);
    }

    public static boolean isEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("12345"));
        System.out.println(checkPassword("12345678"));
        System.out.println(checkPassword("12345678a"));
        System.out.println(checkPassword("12345678aA"));
        System.out.println(checkPassword("12345678aA!"));
        System.out.println(isPhone("1234567890"));
        System.out.println(isPhone("+1234567890"));
        System.out.println(isPhone("+1234567890a"));
        System.out.println(isEmail(""));
    }

}
