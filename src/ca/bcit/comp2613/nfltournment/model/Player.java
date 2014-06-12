package ca.bcit.comp2613.nfltournment.model;



public class Player {
	public enum POSITION {goalie,center,defence,left_wing, right_wing}
	//INSTANCE VARIABLES/FIELDS
	String firstName;
	String lastName;
	POSITION position;
	String teamName;
	double height;
	double weight;
	int age;
	int salary;
	
	//CONSTRUCTOR METHOD
	/*
	public Player() {
		
	}
	*/
	public Player(String f, String l, POSITION p, String t, double h, double w, int a, int s) {
		setFirstName(f);
		setLastName(l);
		setPosition(p);
		setTeamName(t);
		setHeight(h);
		setWeight(w);
		setAge(a);
		setSalary(s);
	}
	
	
	//ACCESSOR METHODS
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public POSITION getPosition() {
		return position;
	}
	public String getTeamName() {
		return teamName;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String toString(){
		return "Player's details\n" +
				"\tFull Name = " + this.getFirstName() + " " + this.getLastName() + "\n" +
				"\tPosition = " + this.getPosition() + "\n" +
				"\tTeam Name = " + this.getTeamName() + "\n" +
				"\tHeight = " + this.getHeight() + "\n" +
				"\tWeight = " + this.getWeight() + "\n" +
				"\tAge = " + this.getAge() + "\n" +
				"\tSalary = " + this.getSalary() + "\n";
	}

	//MUTATOR METHODS
	public void setFirstName(String f) {
		firstName = f;
	}
	public void setLastName(String l) {
		lastName = l;
	}
	public void setPosition(POSITION p) {
		position = p;
	}
	public void setTeamName(String t) {
		teamName = t;
	}
	public void setHeight(double h) {
		height = h;
	}
	public void setWeight(double w) {
		weight = w;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setSalary(int s) {
		salary = s;
	}
	
	//UTILITIY METHODS
	public void print(){
		System.out.println(this.toString());
	}
	}	