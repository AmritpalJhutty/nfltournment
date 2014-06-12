import java.util.ArrayList;

import ca.bcit.comp2613.a00705285.util.Helper;
import ca.bcit.comp2613.nfltournment.model.Team;
import ca.bcit.comp2613.nfltournment.model.Player;
/**
 * @author Neal
 *
 */
public class TestDriver {
	//MAIN PROGRAM
	public static void main(String[] args){
/*
		//Test Helper by creating few player objects
		Player p1 = Helper.generatePlayer("Canucks");
		Player p2 = Helper.generatePlayer("Canucks");
		Player p3 = Helper.generatePlayer("Canucks");
		Player p4 = Helper.generatePlayer("Canucks");
		p1.print();
		p2.print();
		p3.print();
		p4.print();
*/

		//Test Helper to create an array list of players
		ArrayList<Player> playersList = new ArrayList<Player>();
		for (int i = 0; i < 640; i++){
			playersList.add(Helper.generatePlayer("Canucks"));
		}
		
		for (int i = 0; i < 640; i++){
			playersList.get(i).print();
		}
		
		//Test Helper to create a team
		Team team1 = Helper.generateTeam("Canucks");
		team1.print();
		Team team2 = Helper.generateTeam("Rangers");
		team2.print();
		
		
		//Now, let us use the array list created ABOVE TO DO SORTING
		for (int i = 0; i < 640; i++){
			playersList.add(Helper.generatePlayer("Canucks"));
		}
		//Sort them using first names by insertion sort algorithm
		for (int currentIndex = 0; currentIndex < 640; currentIndex++){
			int requiredIndex = currentIndex;
			for (int runningIndex = currentIndex; runningIndex < 640; runningIndex++){
				if (playersList.get(runningIndex).getFirstName().compareToIgnoreCase(playersList.get(requiredIndex).getFirstName()) < 0){
					requiredIndex = runningIndex;
				}
			}
			//Now swap the element at required index with the one at currentIndex
			Player temp = playersList.get(currentIndex);
			playersList.set(currentIndex, playersList.get(requiredIndex));
			playersList.set(requiredIndex, temp);
		}
		
		for (int i = 0; i < 640; i++){
			System.out.println(playersList.get(i).getFirstName() + " " + playersList.get(i).getLastName());
		}
	}
}
