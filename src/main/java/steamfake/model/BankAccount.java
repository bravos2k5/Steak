package steamfake.model;

import steamfake.StaticData;

import java.util.UUID;

public class BankAccount {

    private UUID id;
    private UUID accountID;
    private int bankID;
    private String soTaiKhoan;

    public BankAccount(UUID id) {
        this.id = id;
    }

    public BankAccount() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAccountID() {
        return accountID;
    }

    public void setAccountID(UUID accountID) {
        this.accountID = accountID;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }


    @Override
    public String toString() {
        return StaticData.bankList.get(bankID) + " - " + soTaiKhoan;
    }
}
