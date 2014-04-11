import java.awt.Point;
import java.io.*;
import java.util.*;


public class Engine {
	
	/* 
	 * 
	 * 8s turns
	 * 
	 * 		1 Move/turn unit.moveUnit()
	 * 		1 Ability/turn unit.doAbility()
	 * 
	 * 		4 Unit/player
	 * 		4 Ability/unit
	 * 
	 * Rune ability system Interface.setAbility()
	 * 
	 * Multiplayer
	 * 
	 * Program Structure
	 * ===========
	 * 
	 * Input:
	 * 		Listener
	 * Processing:
	 * 		Engine
	 * 			Map
	 * 				Cell
	 * 			Unit
	 * 				Ability
	 * 					Rune
	 * Output:
	 * 		Renderer
	 * 			Interface
	 * 
	 */
	
	private Map map;
	private UserInterface userInterface;
	private Renderer renderer;
	private Listener listener;
	private List<Unit> unitList = new ArrayList<Unit>();
	
	public Engine(){
		userInterface = new UserInterface(this);
		renderer = new Renderer(this);
		listener = new Listener(this);

		map = new Map(32, 32); // TODO input prebuilt maps
		Scanner scn = new Scanner("unit.txt");
		while(scn.hasNextLine()){
			unitList.add(new Unit(scn.nextLine()));
		}
		scn.close();
	}
	
	public void input(Point point){
		// TODO Example
		// on keypress ability A with unitA highlighted, activates ability A
		// pushes an arraylist with the unit's cell at 0 and the mouse's cell at 1
	}

	//==Getters==
	
	public List<Unit> getUnitList(){
		return unitList;
	}
	
	public Listener getListener(){
		return listener;
	}

	public Renderer getRenderer() {
		return renderer;
	}
	
	public UserInterface getUserInterface(){
		return userInterface;
	}
	
	public Map getMap(){
		return map;
	}
	
	//===Main Below===
	
	public static void main(String[] args) {
		new Engine();
	}
}
