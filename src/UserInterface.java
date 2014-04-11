
public class UserInterface {
	
	Unit activeUnit;
	Engine engine;
	
	public UserInterface(Engine engineIn){
		engine = engineIn;
	}
	
	public void move(Cell cellIn){
		if(engine.getMap().distance(activeUnit.getIsAt(), cellIn)>activeUnit.getCurrentMove()){
			activeUnit.setIsAt(cellIn);
			// TODO engine.getRenderer().push(activeUnit, cellIn, "move"); 
		}
	}
	
	public Unit getActiveUnit(){
		return activeUnit;
	}
	
	public void setActiveUnit(Unit unitIn){
		activeUnit = unitIn;
	}
}
