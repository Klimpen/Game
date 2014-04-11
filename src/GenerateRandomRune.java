import java.util.List;

public class GenerateRandomRune extends Rune {

	public GenerateRandomRune(String variableIn) {
		super(variableIn);
	}
	
	public List<Cell> activate(List<Cell> cellListIn){
		while(cellListIn.size()>1){
			cellListIn.remove(cellListIn.size()*Math.random());
		}
		return cellListIn;
	}
}
