package Interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	// Atributes 
	private Panel panel;
	
	public Ventana() {
		
		// Window Design
		setTitle("Dibujado de Cucarron");
		setSize(400, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(1,1));
		
		// Instance
		panel = new Panel();
		
		//ADD
		add(panel);
	}
	public static void main(String[] args) {
		Ventana vP = new Ventana();
		vP.setVisible(true);
	}

}
