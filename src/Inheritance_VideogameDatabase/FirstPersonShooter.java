package Inheritance_VideogameDatabase;

public class FirstPersonShooter extends VideoGame{
    private String setting;
    private String guns;
    private boolean isCompetitive;

    public FirstPersonShooter(String gameName, String platform, String creator, String setting, String guns, boolean isCompetitive) {
        super(gameName, platform, creator);
        this.setting = setting;
        this.guns = guns;
        this.isCompetitive = isCompetitive;
    }

    @Override
    public void quickGameOverview() {
        System.out.print("The " + getPlatform() + " Game \"" + getGameName() + "\"");
        if (this.isCompetitive){
            System.out.print(" Is a competitive shooter. ");
        }
        System.out.print(" It is Created by " + getCreator());
        System.out.println(". It's primary guns are: " + this.guns);
    }
}
