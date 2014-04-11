import java.util.List;


public abstract class Rune{
	
	protected int variable;
	protected int numRequirements;
	
	public Rune(String variableIn, String numRequirementsIn){
		if(variableIn!=null){
			variable=Integer.valueOf(variableIn);
		}
		if(numRequirementsIn!=null){
			numRequirements=Integer.valueOf(numRequirementsIn);
		}
	}
	
	public abstract List<Cell> activate(List<Cell> cellListIn);
	// if a rune does not change the cellList, it returns cellListIn

	public int getNumRequirements() {
		return numRequirements;
	}
}
