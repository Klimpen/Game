import java.util.List;


public abstract class Rune {
	
	protected int variable; 
	
	public abstract List<Cell> activate(List<Cell> cellListIn);
	
	private double triangulateDistance(Cell cellA, Cell cellB){
		return Math.sqrt(Math.abs(cellA.getX()-cellB.getX()) * 
				Math.abs(cellA.getX()-cellB.getX()) +
				Math.abs(cellA.getX()-cellB.getX()) * 
				Math.abs(cellA.getX()-cellB.getX()));
	}
}
