
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSizeOfTeam;
 

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        maxSizeOfTeam = 16;
    }

    public String getName() {
        return this.name;
        
    }
    
    public void setMaxSize(int maxSize){
        this.maxSizeOfTeam = maxSize;
        
    }
    
    public int size(){
        return this.players.size();
    }

     public void addPlayer(Player name){
        if (this.players.size() < maxSizeOfTeam)
            this.players.add(name);
        }
    
    public void printPlayers() {
        for (Player member : this.players) {
            System.out.println(member);

        }
    }
    public int goals() {
        int goals = 0;
        for (Player members : this.players) {
            goals+= members.goals();
        } return goals;
}
}