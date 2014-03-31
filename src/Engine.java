import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


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
	private Unit unitA;
	private Unit unitB;
	private Unit unitC;
	private Interface userInterface;
	private Renderer renderer;
	private Listener listener;
	
	public Engine(){
		map = new Map(32, 32); // TODO input prebuilt maps
		unitA = new Unit(); // TODO input prebuilt units
		unitB = new Unit();
		unitC = new Unit();
		userInterface = new Interface();
		renderer = new Renderer(userInterface, map);
		listener = new Listener();
		
		renderer.render();
	}

	public static void main(String[] args) {
		new Engine();
	}
	
}
