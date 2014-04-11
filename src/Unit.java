import java.util.*;

public class Unit {
	
	private Cell isAt;
	private String faction;
	private int currentHP, maxHP;
	private int maxMove, currentMove;
	private HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
	private List<Rune[]> runeLine = new ArrayList<Rune[]>();
	
	public Unit(String characterInput) {
		// runelines are seperated by tabs
		// runes are seperated by spaces
		// subrunelines are seperated by doublespaces
		
		String[] runeLineInput = characterInput.split("\t");
		RuneLine temp = new RuneLine();
		for(int i=0; i<runeLineInput.length; i++){
			String[] runeSubLine = runeLineInput[i].split("  ");
			Rune[] output = new Rune[10];
			for(int j=0; j<runeSubLine.length; j++){
				output = temp.createRuneLine(runeSubLine[j]);
			}
			runeLine.add(output);
		}
		
		Scanner scn = new Scanner("statustypes.txt");
		while(scn.hasNextLine()){ // initializes the list of status effects
			statusMap.put(scn.nextLine(), 0);
		}
		scn.close();
	}
	
	//==RuneLine==
	
	public void activateRuneLine(String input, Cell mousePos){
		RuneLine temp = new RuneLine();
		for(Rune[] i : runeLine){
			if(i[0].equals(temp.createRuneLine(input))){
				List<Cell> tempCellList = new ArrayList<Cell>();
				tempCellList.add(isAt);
				tempCellList.add(mousePos);
				for(int j=0; j<i.length; j++){
					tempCellList = i[j].activate(tempCellList);
				}
			}
		}
	}
	
	public void addRuneLine(Rune[] runeLineIn){
		runeLine.add(runeLineIn);
	}
	
	public void removeRuneLine(Rune[] runeLineIn){
		runeLine.remove(runeLineIn);
	}
	
	//==Getters==
	
	public HashMap<String, Integer> getStatusMap(){
		return statusMap;
	}
	
	public String getFaction(){
		return faction;
	}
	
	public int getCurrentHP(){
		return currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}
	
	public Cell getIsAt() {
		return isAt;
	}

	public int getCurrentMove() {
		return currentMove;
	}
	
	public int getMaxMove(){
		return maxMove;
	}
	
	//==Setters==
	
	public void setIsAt(Cell isAtIn) {
		this.isAt = isAtIn;
	}
	
	public void setFaction(String input){
		faction = input;
	}
	
	
	public void setCurrentHP(int input){
		currentHP = input;
	}

	public void putStatusMap(String nameIn, int durationIn) {
		statusMap.put(nameIn, durationIn);
	}

	public void setCurrentMove(int input){
		currentMove = input;
	}
	
	public void resetMove(){
		currentMove = maxMove;
	}
}
