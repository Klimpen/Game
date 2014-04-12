import java.util.ArrayList;
import java.util.List;


public class ParseFurtherestRune extends Rune {

	public ParseFurtherestRune(String variableIn) {
		super(variableIn);
		// TODO Auto-generated constructor stub
	}

	public List<Cell> activate(List<Cell> cellListIn) {
		return cellListIn;
	}
	
	public List<Cell> activate(List<Cell> cellListIn, Cell unitCell){
		Map map = new Map(32, 32);
		Cell outputCell=null;
		for(Cell i: cellListIn){
			if(outputCell==null){
				outputCell=i;
			}
			if(map.distance(i, unitCell)<map.distance(outputCell, unitCell)){
				outputCell=i;
			}
		}
		List<Cell> temp = new ArrayList<Cell>();
		temp.add(outputCell);
		return temp;
	}

}
