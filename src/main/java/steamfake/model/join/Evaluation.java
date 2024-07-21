package steamfake.model.join;

import java.util.UUID;

public class Evaluation {

    private UUID accountID;
    private UUID gameID;
    private String name;
    private String avatar;
    private int rate;
    private String comment;

    public Evaluation() {
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
