package steamfake.model.dto;

import steamfake.model.Game;

import java.util.UUID;

public class GameDisplay extends Game {

    private int downloadCount;
    private int avgRating;
    private String publisherName;

    public GameDisplay() {
    }

    public GameDisplay(UUID id) {
        super(id);
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

}
