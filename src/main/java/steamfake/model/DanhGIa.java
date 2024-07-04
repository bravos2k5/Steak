package model;

import java.util.UUID;

public class DanhGIa {

    private UUID accountID;
    private UUID gameID;
    private int rate;
    private String comment;

    public DanhGIa(UUID accountID, UUID gameID) {
        this.accountID = accountID;
        this.gameID = gameID;
    }

    public DanhGIa() {
    }

    public UUID getAccountID() {
        return accountID;
    }

    public void setAccountID(UUID accountID) {
        this.accountID = accountID;
    }

    public UUID getGameID() {
        return gameID;
    }

    public void setGameID(UUID gameID) {
        this.gameID = gameID;
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
}
