/**
 * 
 */
package ca.bcit.comp2613.a00705285.util;

import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.nfltournment.model.Player;
import ca.bcit.comp2613.nfltournment.model.Player.POSITION;
import ca.bcit.comp2613.nfltournment.model.Team;

/**
 * @author Neal
 *
 */
public class Helper {
	public static Player generatePlayer(String teamName){
		String firstName, lastName;
		Player.POSITION position;
		double height, weight;
		int age, salary;
		
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random randomNum = new Random();

		//Create first name
		firstName = "";
		for (int i=0; i<6; i++){
			firstName += alphabets.charAt(randomNum.nextInt(52));
		}
		//Create last name
		lastName = "";
		for (int i=0; i<6; i++){
			lastName += alphabets.charAt(randomNum.nextInt(52));
		}
		//create height (it will be in centimeters; therefore int is fine)
		height = 180 + randomNum.nextInt(40);
		//create weight (it will be in kilograms; therefore int is fine)
		weight = 60 + randomNum.nextInt(60);
		//create age (it will be in years; therefore int is fine)
		age = 18 + randomNum.nextInt(22);
		//create salary (it will be in dollars; therefore int is fine)
		salary = 100000*(1+randomNum.nextInt(10));
		//create position
		position = POSITION.values()[randomNum.nextInt(5)];
		
		//assignment 3 try/catch exception
		try{
				//let us have an invalid age 5% of the time so that to get exception
				if (randomNum.nextInt(100) > 95){
					age = 10/0;
				}
		}
		catch (Exception e){
			System.out.println("Bad age found!!!");
		}

		return new Player(firstName, lastName, position, teamName, height, weight, age, salary);
	}

	public static Team generateTeam(String teamName){
		ArrayList<Player> teamRoster = new ArrayList<Player>();
		
		//Create the goalies
		for (int i = 0; i < 2; i++){
			Player p = Helper.generatePlayer(teamName);
			p.setPosition(POSITION.values()[0]);
			teamRoster.add(p);
		}
		//Create the centers
		for (int i = 0; i < 3; i++){
			Player p = Helper.generatePlayer(teamName);
			p.setPosition(POSITION.values()[1]);
			teamRoster.add(p);
		}
		//Create the right_wings
		for (int i = 0; i < 3; i++){
			Player p = Helper.generatePlayer(teamName);
			p.setPosition(POSITION.values()[4]);
			teamRoster.add(p);
		}
		//Create the left_wings
		for (int i = 0; i < 3; i++){
			Player p = Helper.generatePlayer(teamName);
			p.setPosition(POSITION.values()[3]);
			teamRoster.add(p);
		}
		//Create the defence
		for (int i = 0; i < 9; i++){
			Player p = Helper.generatePlayer(teamName);
			p.setPosition(POSITION.values()[2]);
			teamRoster.add(p);
		}
		
		
		Team team = new Team(teamName, teamRoster);
		
		return team;
	}
}
