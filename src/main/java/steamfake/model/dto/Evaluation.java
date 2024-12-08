package steamfake.model.dto;

import steamfake.model.GameLibrary;

import java.util.UUID;

public class Evaluation {

    private UUID accountID;
    private UUID gameID;
    private String name;
    private String avatar;
    private Integer rate;
    private String comment;

    public Evaluation() {
    }

    public Evaluation(GameLibrary gameLibrary) {
        this.accountID = gameLibrary.getAccountId();
        this.gameID = gameLibrary.getGameId();
        this.comment = gameLibrary.getComment();
        this.rate = gameLibrary.getRate();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

}
