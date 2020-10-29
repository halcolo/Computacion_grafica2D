package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D r1 = new Rectangle2D.Double(50, 50, 200, 200);
		Rectangle2D r2 = new Rectangle2D.Double(100, 100, 200, 200);
		Line2D l1 = new Line2D.Double(50, 50, 100, 100);
		Line2D l2 = new Line2D.Double(250, 250, 300, 300);
		Line2D l3 = new Line2D.Double(50, 250, 100, 300);
		Line2D l4 = new Line2D.Double(250, 50, 300, 100);
				
		Stroke pincel = new BasicStroke(2.0f);
		g2.setStroke(pincel);
		
		g2.setColor(Color.BLUE);
		
		g2.draw(r1);
		g2.draw(r2);
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);
		g2.draw(l4);
	}
}
