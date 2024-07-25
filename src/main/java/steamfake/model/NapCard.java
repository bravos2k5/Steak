package steamfake.model;



import java.util.Date;
import java.util.UUID;

public class NapCard extends NapTien {

    private String secretKey;
    private String seri;
    private float menhGia;

    public NapCard(UUID id) {
        super(id);
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

    public float getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(float menhGia) {
        this.menhGia = menhGia;
    }

}
