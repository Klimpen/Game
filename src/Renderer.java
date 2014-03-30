import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Renderer {

	private Image clearTerrain;
	private Image notClearTerrain;
	private Image unit;
	private BufferedImage img;
	private Interface userInterface;
	private Map map;
	private static final int TILERES = 16;
	private JFrame frame;
	
	public Renderer(Interface userInterfaceIn, Map mapIn){
		userInterface = userInterfaceIn;
		map = mapIn;
		try {
			clearTerrain = ImageIO.read(new File("clearTerrain.png"));
			notClearTerrain = ImageIO.read(new File("notClearTerrain.png"));
			unit = ImageIO.read(new File("character.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		img = new BufferedImage(map.getxMax()*TILERES, map.getyMax()*TILERES, BufferedImage.TYPE_INT_RGB);
		frame = new JFrame();
	}
	
	public void render(){
		Graphics g = img.createGraphics();
		
		for(int i=0; i<map.getyMax(); i++){
			for(int j=0; j<map.getxMax(); j++){
				if(map.getCell(j, i).getPassable()){
					g.drawImage(clearTerrain, j*TILERES, i*TILERES, frame);
				}
				else{
					if(map.getCell(j, i).getOccupied()){
						g.drawImage(unit, j*TILERES, i*TILERES, frame);
					}
					else{
						g.drawImage(notClearTerrain, j*TILERES, i*TILERES, frame);
					}
				}
			}
		}
		g.dispose();
	}
}
