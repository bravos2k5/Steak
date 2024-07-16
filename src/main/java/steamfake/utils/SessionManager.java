package steamfake.utils;

import steamfake.dao.AccountDAO;
import steamfake.dao.BankAccountDAO;
import steamfake.model.Account;
import steamfake.model.BankAccount;

import java.util.List;

public class SessionManager {

    public static Account user = null;

    public static boolean isLogin() {
        return user != null;
    }

    public static void logOut() {
        user = null;
    }

    public static List<BankAccount> bankAccountList = null;

    public static void loadBankAccountList() {
        if(user != null && bankAccountList == null) {
            bankAccountList = BankAccountDAO.gI().selectByAccount(user);
        }
    }

    public static void updateMoneyAccount() {
        if(user != null) {
            user.setSoDuGame(AccountDAO.gI().selectSoDuGameByID(user.getId()));
        }
    }

}
