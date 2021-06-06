package Inheritance_VideogameDatabase;

import java.util.ArrayList;

public class VideoGameDatabase {
    public static void main(String[] args) {
        RolePlayingGame rpg1 = new RolePlayingGame("World of Warcraft", "PC", "Blizzard", "Tank, Healer, DPS", true);
        RolePlayingGame rpg2 = new RolePlayingGame("Witcher 3", "PC", "CD Project Red", "Heavy Melee, Fast Melee, Magic", false);

        FirstPersonShooter fps1 = new FirstPersonShooter("Metro Exodus", "PC", "4A Games", "Post apocalyptic Moscow", "Makeshift jank", false);
        FirstPersonShooter fps2 = new FirstPersonShooter("Counter Strike: Global Offensesive", "PC", "Valve", "Counter terrorist bomb diffusal", "Modern assault rifles", true);

        ArrayList<VideoGame> videoGameDatabaseList = new ArrayList<>();

        videoGameDatabaseList.add(rpg1);
        videoGameDatabaseList.add(rpg2);
        videoGameDatabaseList.add(fps1);
        videoGameDatabaseList.add(fps2);

        printGameListOverview(videoGameDatabaseList);

    }
    public static void printGameListOverview(ArrayList<VideoGame> vlist){
        for (int i = 0; i< vlist.size(); i++){
            vlist.get(i).quickGameOverview();
        }
    }
}
