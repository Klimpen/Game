import java.util.*;

public class Unit {
	
	private Ability a;
	private Ability b;
	private Ability c;
	private Ability d;
	private int x, y;
	private boolean faction;
	private int currentHP, maxHP;
	private HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
	
	public Unit(String characterInput) {
		String[] temp = characterInput.split("\t");
		a = new Ability(temp[0]);
		b = new Ability(temp[1]);
		c = new Ability(temp[2]);
		d = new Ability(temp[3]);
		Scanner scn = new Scanner("statustypes.txt");
		while(scn.hasNextLine()){ // initializes the list of status effects
			statusMap.put(scn.nextLine(), 0);
		}
	}
	
	//==Checkers==
	
	//==Getters==
	
	public Ability getA(){
		return a;
	}
	
	public Ability getB(){
		return b;
	}
	
	public Ability getC(){
		return c;
	}
	
	public Ability getD(){
		return d;
	}
	
	public HashMap<String, Integer> getStatusMap(){
		return statusMap;
	}
	
	public boolean getFaction(){
		return faction;
	}
	
	public int getCurrentHP(){
		return currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	//==Setters==
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setCurrentHP(int input){
		currentHP = input;
	}

}
