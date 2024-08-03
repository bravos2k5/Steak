package steamfake.model;

import java.sql.Date;
import java.util.Objects;
import java.util.UUID;

public abstract class NapTien {

    private UUID id;
    private UUID accountID;
    private int method;
    private Date ngayNap;
    private int status;
    private double soTien;

    public static final int NAP_CARD = 0;
    public static final int NAP_CK = 1;
    public static final int PENDING = 0;
    public static final int ACCEPTED = 1;
    public static final int REJECTED = 2;

    public NapTien(UUID id) {
        this.id = id;
    }

    public NapTien() {
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

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public Date getNgayNap() {
        return ngayNap;
    }

    public void setNgayNap(Date ngayNap) {
        this.ngayNap = ngayNap;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NapTien napTien = (NapTien) o;
        return Objects.equals(id, napTien.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
