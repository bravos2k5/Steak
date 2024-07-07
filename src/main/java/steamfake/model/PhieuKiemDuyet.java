package steamfake.model;

import java.sql.Date;
import java.util.UUID;

public class PhieuKiemDuyet {

    public static final int PENDING = 0;
    public static final int ACCEPTED = 1;
    public static final int REJECTED = 2;

    private UUID id;
    private UUID publisherID;
    private String moTa;
    private int status;
    private String thongBao;
    private Date ngayTao;

    public PhieuKiemDuyet() {
    }

    public PhieuKiemDuyet(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(UUID publisherID) {
        this.publisherID = publisherID;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getThongBao() {
        return thongBao;
    }

    public void setThongBao(String thongBao) {
        this.thongBao = thongBao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
}
