import java.util.*;


public class Ability {

	// [Trigger]:[Target|Shape][Effect|Duration]
	
	private List<Rune> runeList;

	public Ability(String input) {
		// initializes all runes in the ability
		// in the form new Rune(variable, requirementNum);
		// TODO add more
		String[] splitInput = input.split(" ");
		for(int counter = 0; counter<splitInput.length; counter++){
			switch(Integer.valueOf(splitInput[counter])){
			case 0: runeList.add(new GenerateRandomRune(null, "0")); break;
			case 1: runeList.add(new GenerateSelfRune(null, "0")); break;
			
			case 2: runeList.add(new ParseFriendlyRune(null, "0")); break;
			case 3: runeList.add(new ParseEnemyRune(null, "0")); break;
			
			case 4: runeList.add(new EffectDamageRune(splitInput[++counter], "0")); break;
			case 5: runeList.add(new EffectStatusRune(splitInput[++counter], "0", splitInput[++counter])); break;
			default: break;
			}
		}
	}
	
	// Activates ability on the input
	public void activate(Cell unitCell, Cell mouseCell){
		List<Cell> cellList = new ArrayList<Cell>();
		cellList.add(unitCell);
		cellList.add(mouseCell);
		//prefix notation - does the nth item in runeList to the cell
		for(int i=0; i<runeList.size(); i++){
			activateRune(cellList, runeList.get(i), i);
			i += runeList.get(i).getNumRequirements();
		}
	}
	
	public void activateRune(List<Cell> cellListIn, Rune runeIn, int i){
		if(runeIn.getNumRequirements()!=0){
			for(int j=0; j<runeIn.getNumRequirements(); j++){
				cellListIn = runeIn.activate(cellListIn);
			}
		}
	}
	
}