package comparableComparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DriverPlayer {

	public static void main(String[] args) {
		  
		    ArrayList<Player> footballTeam = new ArrayList<>();
		    
		    Player player1 = new Player(59, "Karan", 29);
		    Player player2 = new Player(67, "Aarif", 24);
		    Player player3 = new Player(45, "Sompal", 27);
		    
		    footballTeam.add(player1);
		    footballTeam.add(player2);
		    footballTeam.add(player3);

		    PlayerAgeComparator playerComparator = new PlayerAgeComparator();
		   
		    System.out.println("Before Sorting (Age) : " + footballTeam);
		    Collections.sort(footballTeam, playerComparator);
			System.out.println("After Sorting (Age) : " + footballTeam);
		    
		    System.out.println("\n");
		    
		    PlayerNameComparator playerNameComparator = new PlayerNameComparator();
		    
		    System.out.println("Before Sorting (Name) : " + footballTeam);
		    Collections.sort(footballTeam, playerNameComparator);
		    System.out.println("After Sorting (Name) : " + footballTeam);

	}
}
