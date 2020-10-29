package Interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D e1 = new Ellipse2D.Double(50, 50, 250, 250);
		Ellipse2D e2 = new Ellipse2D.Double(150, 150, 50, 50);
		Ellipse2D e3 = new Ellipse2D.Double(150, 150, 50, 50);

		Ellipse2D e4 = new Ellipse2D.Double(80, 150, 30, 30);
		Ellipse2D e5 = new Ellipse2D.Double(90, 90, 30, 30);
		Ellipse2D e6 = new Ellipse2D.Double(90, 210, 30, 30);

		Ellipse2D e7 = new Ellipse2D.Double(235, 150, 30, 30);
		Ellipse2D e8 = new Ellipse2D.Double(225, 90, 30, 30);
		Ellipse2D e9 = new Ellipse2D.Double(225, 210, 30, 30);
		
		// Eyes
		Ellipse2D e10 = new Ellipse2D.Double(145, 20, 30, 30);
		Ellipse2D e12 = new Ellipse2D.Double(145, 25, 20, 20);
		Ellipse2D e11 = new Ellipse2D.Double(175, 20, 30, 30);
		Ellipse2D e13 = new Ellipse2D.Double(175, 25, 20, 20);
		
		Line2D leg1 = new Line2D.Double(75, 100, 40, 70);
		Line2D leg1_2 = new Line2D.Double(40, 70, 30, 90);

		Line2D leg2 = new Line2D.Double(53, 150, 30, 140);
		Line2D leg2_2 = new Line2D.Double(30, 140, 10, 180);
		
		Line2D leg3 = new Line2D.Double(50, 200, 10, 210);
		Line2D leg3_2 = new Line2D.Double(10, 210, 40, 280);
		
		Line2D leg4 = new Line2D.Double(275, 100, 305, 70);
		Line2D leg4_2 = new Line2D.Double(305, 70, 315, 90);

		Line2D leg5 = new Line2D.Double(297, 150, 317, 140);
		Line2D leg5_2 = new Line2D.Double(317, 140, 337, 180);
		
		Line2D leg6 = new Line2D.Double(296, 200, 316, 210);
		Line2D leg6_2 = new Line2D.Double(316, 210, 336, 280);
		
//		Line2D antennas1 = new Line2D.Double(155, 20, 130, 10);
		Arc2D antennas1 = new Arc2D.Double(55, 10, 100, 25, 0, 90,
				Arc2D.OPEN);
		Ellipse2D antennas1_2 = new Ellipse2D.Double(100, 5, 10, 10);
//		Line2D antennas2 = new Line2D.Double(197, 20, 220, 10);
		Arc2D antennas2 = new Arc2D.Double(140, 20, 100, 25, 0, 90,
				Arc2D.OPEN);
		Ellipse2D antennas2_2 = new Ellipse2D.Double(235, 25, 10, 10);
		
		Ellipse2D feet_1 = new Ellipse2D.Double(20, 80, 20, 20);
		Ellipse2D feet_2 = new Ellipse2D.Double(0, 170, 20, 20);
		Ellipse2D feet_3 = new Ellipse2D.Double(30, 270, 20, 20);
		Ellipse2D feet_4 = new Ellipse2D.Double(305, 80, 20, 20);
		Ellipse2D feet_5 = new Ellipse2D.Double(327, 170, 20, 20);
		Ellipse2D feet_6 = new Ellipse2D.Double(326, 270, 20, 20);
		
		Line2D l1 = new Line2D.Double(175, 120, 175, 300);
		Arc2D a1 = new Arc2D.Double(145, 50, 60, 40, 180, 180,
				Arc2D.CHORD);
				
		Stroke pincel = new BasicStroke(2.0f);
		g2.setStroke(pincel);
		
		g2.setColor(Color.BLACK);
		
		g2.draw(e1);
		g2.setColor(Color.RED);
		g2.fill(e1);
		g2.setColor(Color.WHITE);
		g2.fill(e10);
		g2.fill(e11);
		g2.setColor(Color.black);
		g2.fill(e2);
		g2.draw(l1);
		g2.fill(a1);
		g2.draw(e10);
		g2.draw(e11);
		g2.fill(e12);
		g2.fill(e13);
		g2.draw(leg1);
		g2.draw(leg1_2);
		g2.draw(leg2);
		g2.draw(leg2_2);
		g2.draw(leg3);
		g2.draw(leg3_2);
		g2.draw(leg4);
		g2.draw(leg4_2);
		g2.draw(leg5);
		g2.draw(leg5_2);
		g2.draw(leg6);
		g2.draw(leg6_2);
		g2.draw(antennas1);
		g2.fill(antennas1_2);
		g2.draw(antennas2);
		g2.fill(antennas2_2);
		
		g2.draw(e4);
		g2.draw(e5);
		g2.draw(e6);
		g2.draw(e7);
		g2.draw(e8);
		g2.draw(e9);
		
		g2.draw(feet_1);
		g2.draw(feet_2);
		g2.draw(feet_3);
		g2.draw(feet_4);
		g2.draw(feet_5);
		g2.draw(feet_6);
		
		g2.setColor(Color.yellow);
		g2.fill(e4);
		g2.fill(e5);
		g2.fill(e6);
		g2.fill(e7);
		g2.fill(e8);
		g2.fill(e9);
		
		g2.fill(feet_3);
		g2.fill(feet_6);
		
		g2.setColor(Color.GREEN);
		g2.fill(feet_2);
		g2.fill(feet_5);
		
		g2.setColor(Color.BLUE);
		g2.fill(feet_1);
		g2.fill(feet_4);
		
		
	}
}
