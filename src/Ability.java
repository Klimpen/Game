import java.util.Scanner;



public class Ability {
	Rune runeOn, runeTarget, runeAoE, runeA, runeB, runeC;
	Rune[] ability;
	public Ability(String abilityIn){
		//TODO generates an ability from a string
		ability = new Rune[6];
		int marker = 0;
		for(int i=0; i<6; i++){
			int endMarker = abilityIn.indexOf("\t");
			ability[i] = new Rune(Integer.valueOf(abilityIn.substring(marker, endMarker)));
			marker = endMarker;
		}
	}
	
	public Ability(){
		//TODO generates an ability from user input - also generates a string for above constructor
		ability = new Rune[6];
		for(int i=0; i<6; i++){
			ability[i] = new Rune(new Scanner(System.in).nextInt());
		}
	}

	public String getExplaination() {
		//TODO returns an object containing the spell's information
		// for each rune in this, etc.
		return null;
	}
}
