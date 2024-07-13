package steamfake;

import steamfake.dao.BankDAO;
import steamfake.model.Bank;
import steamfake.model.GameLibrary;

import java.util.List;

public class StaticData {

    public static final List<Bank> bankList = BankDAO.selectAll();
    public static List<GameLibrary> gameLibraryList = null;

    private static List<GameLibrary> getGameLibraryList() {
        return gameLibraryList;
    }

    public static void setGameLibraryList(List<GameLibrary> gameLibraryList) {
        StaticData.gameLibraryList = gameLibraryList;
    }
}
