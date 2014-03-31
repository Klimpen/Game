
public class Cell {
	private boolean passable, occupied;
	private int x, y;
	public Cell(int xIn, int yIn){
		x = xIn;
		y = yIn;
		passable = true;
		occupied = false;
	}
	
	public void setPassable(boolean passableIn){
		passable = passableIn;
	}
	
	public boolean getPassable(){
		return passable;
	}
	
	public void setOccupied(boolean occupiedIn){
		occupied = occupiedIn;
		passable = !occupiedIn;
	}
	
	public boolean getOccupied(){
		return occupied;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
