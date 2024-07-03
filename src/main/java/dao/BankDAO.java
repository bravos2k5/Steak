package dao;

public class BankDAO {

    private static BankDAO instance;

    public static BankDAO gI() {
        if(instance == null) {
            instance = new BankDAO();
        }
        return instance;
    }



}
