import java.util.*;


public class Ability {

	// [Trigger]:[Target|Shape][Effect|Duration]
	
	private List<Rune> runeList;

	public Ability(String input) {
		// initializes all runes in the ability
		// TODO add more
		for(int i=0; i<input.length(); i++){
			switch(Integer.valueOf(input.substring(i,i+1))){
			case 0: runeList.add(new GenerateRandomRune()); break;
			case 1: runeList.add(new GenerateSelfRune()); break;
			
			case 2: runeList.add(new ParseFriendlyRune()); break;
			case 3: runeList.add(new ParseEnemyRune()); break;
			
			case 4: runeList.add(new EffectDamageRune()); break;
			case 5: runeList.add(new EffectDebuffRune()); break; // TODO
			}
		}
	}
	
	// Activates ability on the input
	public void activateAbility(List<Cell> cellListIn){
		for(Rune i:runeList){
			i.activate(cellListIn);
		}
	}
}