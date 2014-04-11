import java.util.List;


public abstract class Rune{
	
	protected int variable;
	
	public Rune(String variableIn){
		if(variableIn!=null){
			variable=Integer.valueOf(variableIn);
		}
	}
	
	public abstract List<Cell> activate(List<Cell> cellListIn);
	// if a rune does not change the cellList, it returns cellListIn
}
