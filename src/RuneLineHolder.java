import java.util.List;


public class RuneLineHolder extends Rune {

	Rune[] runeLine = new Rune[10];
	
	public RuneLineHolder(String variableIn, Rune[] runeLineIn) {
		super(variableIn);
		
		runeLine = runeLineIn;
	}

	public List<Cell> activate(List<Cell> cellListIn) {
		for(Cell i:cellListIn){
			i.getUnit().addRuneLine(runeLine);
		}
		return cellListIn;
	}
}
