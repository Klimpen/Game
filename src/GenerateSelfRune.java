import java.util.*;


public class GenerateSelfRune extends Rune {

	public List<Cell> activate(List<Cell> cellListIn) {
		List<Cell> temp = new ArrayList<Cell>();
		temp.add(cellListIn.get(0));
		return temp;
	}

}
