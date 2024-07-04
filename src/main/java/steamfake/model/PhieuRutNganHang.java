package model;

import java.util.UUID;

public class PhieuRutNganHang extends PhieuRutTien{
    private int bankID;
    private String soTaiKhoan;

    public PhieuRutNganHang() {
    }

    public PhieuRutNganHang(UUID id) {
        super(id);
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
}
