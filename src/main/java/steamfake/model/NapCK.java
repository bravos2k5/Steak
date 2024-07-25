package steamfake.model;


import java.util.Date;
import java.util.UUID;

public class NapCK extends NapTien {

    private float soTien;

    public NapCK(UUID id) {
        super(id);

    }

    public NapCK() {
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }
}
