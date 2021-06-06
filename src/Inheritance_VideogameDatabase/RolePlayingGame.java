package Inheritance_VideogameDatabase;

public class RolePlayingGame extends VideoGame{
    private String specializations;
    private boolean isMMO;

    public RolePlayingGame (String gameName, String platform, String creator, String specializations, boolean isMMO){
        super(gameName, platform, creator);
        this.specializations = specializations;
        this.isMMO = isMMO;
    }

    @Override
public void quickGameOverview(){
        System.out.print("The " + getPlatform() + " Game \"" + getGameName() + "\"");
        if (this.isMMO){
            System.out.print(" Is an MMORPG.");
        }
        System.out.print(" It is Created by " + getCreator());
        System.out.println(". It's core gameplay specializations are: " + this.specializations);
    }
}
