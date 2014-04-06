import java.util.ArrayList;
import java.util.List;


public class ParseFriendlyRune extends Rune {

	public List<Cell> activate(List<Cell> cellListIn){
		List<Cell> cellListOut = new ArrayList<Cell>();
		for(int i=cellListIn.size(); i<1; i++){
			if(cellListIn.get(0).getUnit().getFaction()==cellListIn.get(i).getUnit().getFaction()){
				cellListIn.remove(i);
			}
		}
		return cellListOut;
	}
}
