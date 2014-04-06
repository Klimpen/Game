import java.util.InputMismatchException;


public class Cell {
	private int x, y;
	private Unit unit;
	private boolean passable;
	
	public Cell(int xIn, int yIn, boolean passableIn){
		x = xIn;
		y = yIn;
		unit = null;
		passable = passableIn;
	}
	
	public boolean getPassable(){
		if(unit!=null){
			return false;
		}
		return passable;
	}
	
	public void setOccupied(Unit unitIn){
		unit=unitIn;
	}
	
	public void setEmpty(){
		unit=null;
	}
	
	public boolean getOccupied(){
		if(unit!=null){
			return true;
		}
		return false;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public Unit getUnit() {
		if(unit==null){
			throw new InputMismatchException();
		}
		return unit;
	}
}
