import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class Listener {
	JPanel p = new JPanel(){};
	Engine engine;
	
	public Listener(Engine engineIn){
		engine = engineIn;
		p.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				engine.input(e.getLocationOnScreen());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
}
