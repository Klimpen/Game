import java.util.InputMismatchException;


public class Unit {
	Ability a;
	Ability b;
	Ability c;
	Ability d;
	Cell isAt;
	
	public Unit(String characterInput) {
		//TODO generates a unit [4 abilities] from preset input
		a = new Ability(characterInput);
		b = new Ability(characterInput);
		c = new Ability(characterInput);
		d = new Ability(characterInput);
	}
	
	public Unit(){ // generates a unit [4 abilities] from user input - also generates a string for above.
		a = new Ability();
		b = new Ability();
		c = new Ability();
		d = new Ability();
	}
	
	public boolean moveUnit(String input, Map map){
		//TODO
		return false;
	}

	public Ability getAbility(int input){
		switch(input){
		case 0: return a;
		case 1: return b;
		case 2: return c;
		case 3: return d;
		default: throw new InputMismatchException();
		}
	}
}
