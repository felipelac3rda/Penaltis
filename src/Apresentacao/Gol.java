package Apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Gol extends JPanel{
	private Placar placar;

	public Gol() {
		placar = new Placar();
		setPreferredSize(new Dimension(1100, 600));
		organizarGol();
	}

	public void organizarGol() {
		setLayout(new GridLayout(8, 16));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				if ((j == 1 && i >= 1) || (i == 1 && j >= 1 && j <= 14) || (j == 14 && i >= 1)) {
					criarBotao(Color.WHITE, "fora");
				} else if ((i == 0 && j >= 0) || (j == 0 && i >= 0) || (j == 15 && i >= 1)) {
					criarBotao(Color.green, "fora");
				} else {
					criarBotao(Color.green, "dentro");
				}

			}
		}

	}

	public void criarBotao(Color cor, String tipo) {
		Botao b = new Botao(cor, tipo);
		add(b);
		b.addActionListener(placar);

	}

	public Placar getPlacar() {
		return placar;
	}

}
