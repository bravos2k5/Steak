package steamfake.model;

import java.util.UUID;

public class NapCK extends NapTien {

    public static final int MOMO = 0;
    public static final int BANK = 1;

    private int hinhThuc;

    public NapCK(UUID id) {
        super(id);
        this.setMethod(NAP_CK);
    }

    public NapCK() {
    }

    public int getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(int hinhThuc) {
        this.hinhThuc = hinhThuc;
    }
}
