package interfaz;

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
		
		
		Polygon  base = new Polygon() ;
		base.addPoint(100, 275) ;
		base.addPoint(100, 295) ;
		base.addPoint(290, 295);
		base.addPoint(290, 275) ;
		
		Ellipse2D wheel_1 = new Ellipse2D.Double(120, 251, 70, 70);
		Ellipse2D wheel_2 = new Ellipse2D.Double(210, 251, 70, 70);
		Ellipse2D wheel_1_1 = new Ellipse2D.Double(148, 278, 15, 15);
		Ellipse2D wheel_2_1 = new Ellipse2D.Double(238, 278, 15, 15);
		
		Line2D l1 = new Line2D.Double(300, 170, 300, 260);
		Line2D l2 = new Line2D.Double(280, 170, 280, 260);
		Arc2D pill_1_base_1 = new Arc2D.Double(280, 163, 20, 20, 180, -180,
				Arc2D.OPEN);
		Arc2D pill_1_base_2 = new Arc2D.Double(280, 250, 20, 20, 180, 180,
				Arc2D.OPEN);
		
		Line2D l3 = new Line2D.Double(278, 170, 278, 260);
		Line2D l4 = new Line2D.Double(258, 170, 258, 260);
		Arc2D pill_2_base_1 = new Arc2D.Double(258, 163, 20, 20, 180, -180,
				Arc2D.OPEN);
		Arc2D pill_2_base_2 = new Arc2D.Double(258, 250, 20, 20, 180, 180,
				Arc2D.OPEN);
		
		Line2D l5 = new Line2D.Double(256, 170, 256, 260);
		Line2D l6 = new Line2D.Double(236, 170, 236, 260);
		Arc2D pill_3_base_1 = new Arc2D.Double(236, 163, 20, 20, 180, -180,
				Arc2D.OPEN);
		Arc2D pill_3_base_2 = new Arc2D.Double(236, 250, 20, 20, 180, 180,
				Arc2D.OPEN);
		
		Line2D l7 = new Line2D.Double(234, 170, 234, 260);
		Line2D l8 = new Line2D.Double(214, 170, 214, 260);
		Arc2D pill_4_base_1 = new Arc2D.Double(214, 163, 20, 20, 180, -180,
				Arc2D.OPEN);
		Arc2D pill_4_base_2 = new Arc2D.Double(214, 250, 20, 20, 180, 180,
				Arc2D.OPEN);
		
		Line2D l9 = new Line2D.Double(212, 170, 212, 260);
		Line2D l10 = new Line2D.Double(192, 170, 192, 260);
		Arc2D pill_5_base_1 = new Arc2D.Double(192, 163, 20, 20, 180, -180,
				Arc2D.OPEN);
		Arc2D pill_5_base_2 = new Arc2D.Double(192, 250, 20, 20, 180, 180,
				Arc2D.OPEN);
		
		
		Polygon  tail_base = new Polygon() ;
		tail_base.addPoint(110, 228);
		tail_base.addPoint(190, 228) ;
		tail_base.addPoint(190, 270) ;
		tail_base.addPoint(130, 270) ;
		
		Polygon  tail_base_2 = new Polygon() ;
		tail_base_2.addPoint(110, 200);
		tail_base_2.addPoint(190, 200) ;
		tail_base_2.addPoint(190, 230) ;
		tail_base_2.addPoint(110, 230) ;
		
		Polygon  tail_base_tail = new Polygon() ;
		tail_base_tail.addPoint(108, 200);
		tail_base_tail.addPoint(100, 200) ;
		tail_base_tail.addPoint(100, 235) ;
		tail_base_tail.addPoint(108, 235) ;
		
		Polygon  tail_top = new Polygon() ;
		tail_top.addPoint(110, 120);
		tail_top.addPoint(185, 120) ;
		tail_top.addPoint(185, 198) ;
		tail_top.addPoint(130, 198) ;
		
		Polygon  tail_top_top = new Polygon() ;
		tail_top_top.addPoint(100, 90);
		tail_top_top.addPoint(190, 90) ;
		tail_top_top.addPoint(190, 118) ;
		tail_top_top.addPoint(100, 118) ;
		
		Polygon  front = new Polygon() ;
		front.addPoint(292, 260);
		front.addPoint(310, 260) ;
		front.addPoint(330, 310) ;
		front.addPoint(292, 310) ;
		
		Polygon  front_nose = new Polygon() ;
		front_nose.addPoint(302, 200);
		front_nose.addPoint(310, 200) ;
		front_nose.addPoint(310, 230) ;
		front_nose.addPoint(302, 230) ;
		
		Polygon  head = new Polygon() ;
		head.addPoint(300, 170);
		head.addPoint(280, 170) ;
		head.addPoint(280, 130) ;
		head.addPoint(300, 130) ;
		
		Polygon  hexagon = new Polygon() ;
		hexagon.addPoint(310, 115) ;
		hexagon.addPoint(300, 130);
		hexagon.addPoint(280, 130) ;
		hexagon.addPoint(270, 115) ;
		hexagon.addPoint(280, 95) ;
		hexagon.addPoint(300, 95) ;
		
		
		g2.setColor(Color.BLACK);
		g2.draw(base);
		g2.draw(wheel_1);
		g2.draw(wheel_2);
		g2.draw(wheel_1_1);
		g2.draw(wheel_2_1);
		
		// Pill 1
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(pill_1_base_1);
		g2.draw(pill_1_base_2);
		
		// Pill 2
		g2.draw(l3);
		g2.draw(l4);
		g2.draw(pill_2_base_1);
		g2.draw(pill_2_base_2);
		
		// Pill 3
		g2.draw(l5);
		g2.draw(l6);
		g2.draw(pill_3_base_1);
		g2.draw(pill_3_base_2);
		
		// Pill 4
		g2.draw(l7);
		g2.draw(l8);
		g2.draw(pill_4_base_1);
		g2.draw(pill_4_base_2);
		
		// Pill 5
		g2.draw(l9);
		g2.draw(l10);
		g2.draw(pill_5_base_1);
		g2.draw(pill_5_base_2);
		
		//Tail
		g2.draw(tail_base);
		g2.draw(tail_base_2);
		g2.draw(tail_base_tail);
		g2.draw(tail_top);
		g2.draw(tail_top_top);
		
		//front
		g2.draw(front);
		g2.draw(front_nose);
		g2.draw(head);
		g2.draw(hexagon);
		
	}
}
