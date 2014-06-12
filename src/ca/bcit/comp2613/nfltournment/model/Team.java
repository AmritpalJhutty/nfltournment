package ca.bcit.comp2613.nfltournment.model;

import java.util.*;


public class Team {
	//INSTANCE VARIABLES/FIELDS
	String teamName;
	ArrayList<Player> teamRoster;
	
	//CONSTRUCTOR METHODS
	public Team() {
		this.teamName =  "Default Team";
		this.teamRoster = new ArrayList<Player>();
	}


	public Team(String teamName) {
		this.teamName = teamName;
		this.teamRoster = new ArrayList<Player>();
	}

	public Team(String teamName, ArrayList<Player> teamRoster) {
		this.teamName = teamName;
		this.teamRoster = teamRoster;
	}


	//SETTERTS
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}


	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	 * @return the teamRoster
	 */
	public ArrayList<Player> getTeamRoster() {
		return teamRoster;
	}


	/**
	 * @param teamRoster the teamRoster to set
	 */
	public void setTeamRoster(ArrayList<Player> teamRoster) {
		this.teamRoster = teamRoster;
	}
	
	public String toString(){
		String s;
		s = "Teams details\n\tTeam Name = " + this.getTeamName() + "\n\tPlayers\n";
		if (this.teamRoster != null){
			for (Player p : this.teamRoster){
				s = s + p.toString();
			}
		}
		return s;
	}
	
	public void print(){
		System.out.println(this.toString());
	}
}
