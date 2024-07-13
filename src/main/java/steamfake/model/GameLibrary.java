package steamfake.model;

import java.sql.Date;
import java.util.UUID;

public class GameLibrary {

    private UUID accountId;
    private UUID gameId;
    private float giaMua;
    private Date ngayMua;
    private int rate;
    private String comment;

    public GameLibrary() {
    }

    public GameLibrary(UUID accountId, UUID gameId, float giaMua, Date ngayMua) {
        this.accountId = accountId;
        this.gameId = gameId;
        this.giaMua = giaMua;
        this.ngayMua = ngayMua;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public UUID getGameId() {
        return gameId;
    }

    public void setGameId(UUID gameId) {
        this.gameId = gameId;
    }

    public float getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(float giaMua) {
        this.giaMua = giaMua;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

}
