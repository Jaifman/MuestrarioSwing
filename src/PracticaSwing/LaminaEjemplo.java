package PracticaSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaEjemplo extends JPanel {
	
	public void paintComponent(Graphics g){
		
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
		
		g2.setPaint(Color.YELLOW);
		
		g2.fill(rectangulo);
	}
}
