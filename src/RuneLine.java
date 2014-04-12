
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
		
		if(splitInput[0]=="EffectBuffRune token"){
			// for the specific case of a rune which holds a runeline which is applied on trigger which is the last rune before this subRuneLine
			runeArray[0] = new RuneLineHolder(null, createRuneLine(input.substring(splitInput[0].length())));
			return runeArray;
		}
		
		for(int counter = 0; counter<splitInput.length; counter++){
			switch(Integer.valueOf(splitInput[counter])){
				// list all all potential runes
				case 0: runeArray[i] = new TriggerTurnRune(null); break;
				case 1: runeArray[i] = new TriggerKeyRune(splitInput[++counter]); break;
				
				case 2: runeArray[i] = new GenerateRandomRune(null); break;
				case 3: runeArray[i] = new GenerateSelfRune(null); break;
				case 4: runeArray[i] = new GenerateCircleRune(null); break;
				case 5: runeArray[i] = new GenerateConeRune(null); break;
				case 6: runeArray[i] = new GenerateChainRune(null); break;
				case 7: runeArray[i] = new GenerateLineRune(null); break;
				
				
				case 8: runeArray[i] = new ParseFriendlyRune(null); break;
				case 9: runeArray[i] = new ParseEnemyRune(null); break;
				case 10:runeArray[i] = new ParseNearestRune(null); break;
				case 11:runeArray[i] = new ParseFurtherestRune(null); break;
				
				case 12:runeArray[i] = new EffectDamageRune(splitInput[++counter]); break;
				case 13:runeArray[i] = new EffectStatusRune(splitInput[++counter], splitInput[++counter]); break;
				default: break;
			}
			i++;
		}
		return runeArray;
	}	
}