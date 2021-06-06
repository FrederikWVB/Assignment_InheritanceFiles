package Inheritance_VideogameDatabase;

public abstract class VideoGame {
    private String gameName;
    private String platform;
    private String creator;

    public VideoGame(String gameName, String platform, String creator) {
        this.gameName = gameName;
        this.platform = platform;
        this.creator = creator;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPlatform() {
        return platform;
    }

    public String getCreator() {
        return creator;
    }

    public abstract void quickGameOverview();
}
