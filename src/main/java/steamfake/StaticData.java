package steamfake;

import steamfake.dao.BankDAO;
import steamfake.model.Bank;

import java.util.List;

public class StaticData {
    public static final List<Bank> bankList = BankDAO.selectAll();
}
