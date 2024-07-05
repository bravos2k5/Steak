package steamfake.model;

import java.sql.Date;
import java.util.UUID;

public class PhieuRutTien {

    private UUID id;
    private UUID accountID;
    private float soTienRut;
    private int method;
    private Date ngayRut;
    private boolean trangThai;

    public PhieuRutTien(UUID id) {
        this.id = id;
    }

    public PhieuRutTien() {
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

    public float getSoTienRut() {
        return soTienRut;
    }

    public void setSoTienRut(float soTienRut) {
        this.soTienRut = soTienRut;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public Date getNgayRut() {
        return ngayRut;
    }

    public void setNgayRut(Date ngayRut) {
        this.ngayRut = ngayRut;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
