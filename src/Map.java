
public class Map {
	private int xMax, yMax;
	private Cell[][] map;
	
	public Map(int xIn, int yIn){
		
		xMax = xIn;
		yMax = yIn;
		map = new Cell[xMax][yMax];
		
		for(int i=0; i<yMax; i++){
			for(int j=0; j<xMax; j++){
				map[j][i] = new Cell(j, i, true);
			}
		}
	}
	
	public Cell getCell(int xIn, int yIn){
		return map[xIn][yIn];
	}

	public int getXMax(){
		return xMax;
	}

	public int getYMax(){
		return yMax;
	}

	public int distance(Cell cellInA, Cell cellInB) {
		return Math.abs(cellInA.getX()-cellInB.getX())+Math.abs(cellInA.getY()-cellInB.getY());
	}
}
