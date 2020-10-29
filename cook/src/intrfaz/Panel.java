package intrfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Polygon  triangle_tail = new Polygon() ;
		triangle_tail.addPoint(20, 100);
		triangle_tail.addPoint(20, 170) ;
		triangle_tail.addPoint(40, 120) ;
		
		Polygon  polygon_tail = new Polygon() ;
		polygon_tail.addPoint(20, 100) ;
		polygon_tail.addPoint(60, 100) ;
		polygon_tail.addPoint(80, 120) ;
		polygon_tail.addPoint(40, 120);
		
		Polygon  triangle_tail_2 = new Polygon() ;
		triangle_tail_2.addPoint(40, 120);
		triangle_tail_2.addPoint(80, 120) ;
		triangle_tail_2.addPoint(60, 140) ;
		
		Polygon body = new Polygon() ;
		body.addPoint(80, 120) ;
		body.addPoint(60, 140) ;
		body.addPoint(80, 160) ;
		body.addPoint(110, 160);
		body.addPoint(130, 140) ;
		body.addPoint(110, 120);
		
		Polygon legs = new Polygon();
		legs.addPoint(85, 160);
		legs.addPoint(95, 160);
		legs.addPoint(95, 200);
		legs.addPoint(85, 200);

		Ellipse2D feet = new Ellipse2D.Double(60, 200, 60, 10);
		
		Polygon  triangle_neck = new Polygon() ;
		triangle_neck.addPoint(80, 120) ;
		triangle_neck.addPoint(110, 120);
		triangle_neck.addPoint(110, 80) ;
		
		Polygon  head = new Polygon() ;
		head.addPoint(110, 80) ;
		head.addPoint(110, 100);
		head.addPoint(130, 100) ;
		head.addPoint(130, 80) ;
		
		Polygon  crest = new Polygon() ;
		crest.addPoint(130, 80) ;
		crest.addPoint(95, 80);
		crest.addPoint(105, 60) ;
		
		Polygon bot_crest = new Polygon() ;
		bot_crest.addPoint(120, 100) ;
		bot_crest.addPoint(125, 110);
		bot_crest.addPoint(115, 110) ;
		
		Polygon  peak = new Polygon() ;
		peak.addPoint(130, 100);
		peak.addPoint(130, 80) ;
		peak.addPoint(140, 100) ;
		
		g2.setColor(Color.GREEN);
		g2.fill(triangle_tail);
		g2.fill(body) ;
		
		System.out.println(Color.green);
		
		g2.setColor(Color.YELLOW);
		g2.fill(triangle_tail_2) ;
		g2.fill(legs);
		
		
		g2.setColor(Color.MAGENTA);
		g2.fill(polygon_tail);
		
		g2.setColor(Color.RED);
		g2.fill(feet);
		g2.fill(crest);
		g2.fill(bot_crest);
		
		g2.setColor(Color.MAGENTA);
		g2.fill(triangle_neck);
		
		g2.setColor(Color.BLUE);
		g2.fill(head);
		
		g2.setColor(Color.ORANGE);
		g2.fill(peak);
		
		Stroke pincel = new BasicStroke(10.0f);
	
		g2.setColor(Color.WHITE);
		g2.draw(triangle_tail);
		g2.draw(body) ;
		g2.draw(polygon_tail);
		g2.draw(feet);
		g2.draw(crest);
		g2.draw(bot_crest);
		g2.draw(triangle_neck);
		g2.draw(head);
		g2.draw(peak);
		
	}
}
