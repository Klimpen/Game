
public class Map {
	private int xMax, yMax;
	private Cell[][] map;
	
	public Map(int xIn, int yIn){
		xMax = xIn;
		yMax = yIn;
		map = new Cell[getxMax()][yMax];
		for(int i=0; i<yMax; i++){
			for(int j=0; j<getxMax(); j++){
				map[j][i] = new Cell(j, i);
			}
		}
	}
	
	public String move(Cell fromCell, Cell toCell){
		//TODO
		// must check legality of path
		// returns string which unit would move
		return null;
	}
	
	public Cell getCell(int xIn, int yIn){
		return map[xIn][yIn];
	}

	public int getxMax(){
		return xMax;
	}

	public int getyMax(){
		return yMax;
	}
}
