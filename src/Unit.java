import java.util.InputMismatchException;


public class Unit {
	
	Ability a;
	Ability b;
	Ability c;
	Ability d;
	int x, y;
	
	static int ABILITYLENGTH = 8; // TODO PLACEHOLDER
	
	public Unit(String characterInput) {
		//TODO generates a unit [4 abilities] from preset input
		a = new Ability(characterInput.substring(0 * ABILITYLENGTH, 1 * ABILITYLENGTH));
		b = new Ability(characterInput.substring(1 * ABILITYLENGTH, 2 * ABILITYLENGTH));
		c = new Ability(characterInput.substring(2 * ABILITYLENGTH, 3 * ABILITYLENGTH));
		d = new Ability(characterInput.substring(3 * ABILITYLENGTH, 4 * ABILITYLENGTH));
	}
	
	public Unit(){ // generates a unit [4 abilities] from user input - also generates a string for above.
		a = new Ability();
		b = new Ability();
		c = new Ability();
		d = new Ability();
	}
	
	public boolean moveUnit(String input){
		// Recursively moves a unit until move input is empty
		// Is naive - assumes input is legal
		
		if(input.length()==0){
			return true;
		}
		
		switch(input.substring(0, 1)){
		case "N": x+=1; break;
		case "E": y+=1; break;
		case "S": x-=1; break;
		case "W": y-=1; break;
		default: throw new InputMismatchException();
		}
		
		return this.moveUnit(input.substring(1));
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
