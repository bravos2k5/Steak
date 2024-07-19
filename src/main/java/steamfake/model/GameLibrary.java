package steamfake.model;

import java.sql.Date;
import java.util.Objects;
import java.util.UUID;

public class GameLibrary {

    private UUID accountId;
    private UUID gameId;
    private double giaMua;
    private Date ngayMua;
    private Integer rate;
    private String comment;

    public GameLibrary() {
    }

    public GameLibrary(UUID accountId, UUID gameId, float giaMua, Date ngayMua) {
        this.accountId = accountId;
        this.gameId = gameId;
        this.giaMua = giaMua;
        this.ngayMua = ngayMua;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
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

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameLibrary that = (GameLibrary) o;
        return Objects.equals(accountId, that.accountId) && Objects.equals(gameId, that.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, gameId);
    }
}
