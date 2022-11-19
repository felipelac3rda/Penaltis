package Apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Placar extends JPanel implements ActionListener {
	JTextField mostrarPontosJogador;
	JTextField mostrarPontosGoleiro;
	int pontosGoleiro;
	int pontosJogador;
	String pontosJogadorString = "";
	String pontosGoleiroString = "";
	ImageIcon img;

	public Placar() {

		img = new ImageIcon(getClass().getResource("Bola.png"));
		setPreferredSize(new Dimension(1100, 100));
		setBackground(new Color(128, 128, 128));
		pontosGoleiro = 0;
		pontosJogador = 0;
		mostrarPontosJogador = new JTextField(5);
		mostrarPontosGoleiro = new JTextField(5);
		organizarPlacar();

	}

	public void organizarPlacar() {
		JLabel pontosGoleiro = new JLabel();
		JLabel pontosJogador = new JLabel();

		pontosGoleiro.setText("Pontos Goleiro:");
		pontosJogador.setText("Pontos Jogador:");

		mostrarPontosJogador.setEditable(false);
		mostrarPontosGoleiro.setEditable(false);

		setLayout(new FlowLayout());
		add(pontosGoleiro);
		add(mostrarPontosGoleiro);
		add(pontosJogador);
		add(mostrarPontosJogador);
	}

	public void actionPerformed(ActionEvent e) {
			Botao b = (Botao) e.getSource();
			b.setIcon(img);
			
			if(b.getTipo() == "dentro") {
				pontosJogador++;
				pontosJogadorString = Integer.toString(pontosJogador);
				mostrarPontosJogador.setText(pontosJogadorString);
			}else{
				pontosGoleiro++;
				pontosGoleiroString = Integer.toString(pontosGoleiro);
				mostrarPontosGoleiro.setText(pontosGoleiroString);
			}
		}
	
	
}
