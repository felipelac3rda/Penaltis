package Apresentacao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton {
	private String tipo = "";

	public Botao(Color cor, String tipo) {
		this.tipo = tipo;
		setOpaque(true);
		setBackground(cor);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		
	}

	public String getTipo() {
		return tipo;
	}


}
