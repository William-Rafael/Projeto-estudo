package com.exemplo.hellojar;

import java.awt.Dimension;
import javax.swing.JFrame;


public class HelloFrame extends JFrame{

	public static void main(String[] args) {
		// praticando a instancia do JFrame
		JFrame frame = new JFrame("Hello JAR");
		//configuracoes
		frame.setSize(new Dimension(400,200));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar a aplicacao ao fechar a janela
		frame.setLocationRelativeTo(null); //centralizar o frame
		frame.setVisible(true);

	}

}
