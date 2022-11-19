package Apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Background extends JFrame{
	public Background() {
		setSize(1100,700);
		setTitle("Penaltis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizarLayout();
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Gol gol = new Gol();
		Placar placar = gol.getPlacar();

		
		
		add(gol, BorderLayout.SOUTH);
		add(placar, BorderLayout.NORTH);
	}
}
