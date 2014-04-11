
public class RuneLine {

	// [Trigger]:[Target][Effect]
	
	public RuneLine() {
	}
	
	public Rune[] createRuneLine(String input){
		
		// initializes all runes in the runeline
		// in the form new Rune(variable);
		// TODO add more
		String[] splitInput = input.split(" ");
		Rune[] runeArray = new Rune[10];
		int i = 0;
		for(int counter = 0; counter<splitInput.length; counter++){
			switch(Integer.valueOf(splitInput[counter])){
				// list all all potential runes
				case 0: runeArray[i] = new TriggerTurnRune(null); break;
				case 1: runeArray[i] = new TriggerKeyRune(splitInput[++counter]); break;
				case 2: runeArray[i] = new TriggerEndRune(null); break;
				
				case 3: runeArray[i] = new GenerateRandomRune(null); break;
				case 4: runeArray[i] = new GenerateSelfRune(null); break;
				
				case 5: runeArray[i] = new ParseFriendlyRune(null); break;
				case 6: runeArray[i] = new ParseEnemyRune(null); break;
				
				case 7: runeArray[i] = new EffectDamageRune(splitInput[++counter]); break;
				case 8: runeArray[i] = new EffectStatusRune(splitInput[++counter], splitInput[++counter]); break;
				default: break;
			}
			i++;
		}
		return runeArray;
	}	
}