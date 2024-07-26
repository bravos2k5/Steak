package steamfake.model;


import java.util.UUID;

public class NapCK extends NapTien {

    private int hinhThuc;

    public static final int NGAN_HANG = 0;
    public static final int MOMO = 1;

    public NapCK(UUID id) {
        super(id);
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
