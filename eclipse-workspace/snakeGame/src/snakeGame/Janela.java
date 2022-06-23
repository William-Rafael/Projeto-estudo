package snakeGame;

import javax.swing.JFrame;

public class Janela extends JFrame {
	// Criando construtor da classe.
	public Janela() {
		Painel painel = new Painel(); // Inst�ncia do objeto painel, que faz refr�ncia a classe Painel.
		this.add(painel); // Faz refer�ncia as ferramentas do JPanel.
		this.setTitle("Jogo da Cobrinha - Projeto Impacta/Qintess"); // T�tulo da janela.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Respons�vel por terminar a execu��o do programa ao fechar a janela.
		this.setResizable(false); // Impede que o tamanho da janela seja redimensionado.
		this.pack(); // Respons�vel por comportar o conte�do da janela.
		this.setVisible(true); // Respons�vel pela visibilidade da janela.
		this.setLocationRelativeTo(null); // Respons�vel por centralizar a janela no centro da tela.
	}
}