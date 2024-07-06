package steamfake.model;

import java.util.UUID;

public class NapCard extends NapTien{

    public static final int MOBIFONE = 0;
    public static final int VIETTEL = 1;
    public static final int VINAPHONE = 2;

    private String secretKey;
    private String seri;
    private int nhaMang;

    public NapCard(UUID id) {
        super(id);
        this.setMethod(NAP_CARD);
    }

    public NapCard() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public int getNhaMang() {
        return nhaMang;
    }

    public void setNhaMang(int nhaMang) {
        this.nhaMang = nhaMang;
    }
}
