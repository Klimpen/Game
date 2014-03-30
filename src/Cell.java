
public class Cell {
	private boolean passable, occupied;
	public Cell(){
		passable = true;
		occupied = false;
	}
	
	public boolean setPassable(boolean passableIn){
		passable = passableIn;
		return true;
	}
	
	public boolean getPassable(){
		return passable;
	}
	
	public boolean setOccupied(boolean occupiedIn){
		occupied = occupiedIn;
		if(this.setPassable(occupiedIn)){
			return true;
		}
		return false;
	}
	
	public boolean getOccupied(){
		return occupied;
	}
}
