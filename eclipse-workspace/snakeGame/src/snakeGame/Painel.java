package snakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Painel extends JPanel implements ActionListener {
	static final int LARGURA_TELA = 800;
	static final int ALTURA_TELA = 600;
	static final int CELULAS = 25;
	static final int UND_JOGO = (LARGURA_TELA * ALTURA_TELA) / CELULAS; // ***
	static final int VELOCIDADE = 120;
	final int linhas[] = new int[UND_JOGO]; // ***
	final int colunas[] = new int[UND_JOGO]; // ***
	int partesCobra = 5;
	int frutasComidas;
	int frutaEixoX;
	int frutaEixoY;
	char direcao = 'D'; // (D = direita, E = esquerda, C = cima, B = baixo)
	boolean rodando = false; // Vari�vel que testa a condi��o de execu��o do jogo.
	boolean auxPausa = false; // Vari�vel auxiliar que trata da pausa do jogo.
	boolean auxInicio = false; // Vari�vel auxiliar que trata a primeira execu��o do jogo.
	boolean auxGameOver = false; // Vari�vel auxiliar que trata do Game Over do jogo.
	Timer timer;
	Random random;

	// Criando construtor da classe.
	Painel() {
		this.random = new Random();
		MapaTeclas teclas = new MapaTeclas();
		this.setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA)); // Definindo o tamanho do painel.
		this.setBackground(Color.black); // Definindo a cor do fundo.
		this.setFocusable(true); // M�todo repons�vel por d� foco ao eventos do construtor (Mapa de teclas).
		this.addKeyListener(teclas); // M�todo que adiciona ao contrutor a a��o da tecla pressionada, que tem como
										// par�metro o objeto que faz refer�ncia a classe interna MapaTeclas.
	}

	// M�todo respons�vel por iniciar o jogo.
	public void iniciarJogo() {
		novaFruta(); // M�todo repons�vel como gerar uma fruta no tabuleiro.
		this.rodando = true; // Seta a vari�vel como true para valida��o das l�gicas de Game Over e pausas do
								// jogo.
		this.timer = new Timer(VELOCIDADE, this); // Recebe dois par�metros, um do tipo inteiro para delay, e um do tipo
													// constru�do da interface ActionListener.
		timer.start(); // Iniciasse o timer de execu��o.
	}

	// M�todo respons�vel por toda a pintura da janela. (Sobrescrita padr�o para se
	// trabalhar com pinturas)
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		pintura(g);
	}

	// M�todo respons�vel pelo desenho da janela.
	public void pintura(Graphics g) {
		// Pintura da mensagem de �nicio.
		if (!auxInicio) { // Condiciona a execu��o da tela aguardando a intera��o do usu�rio.
			imprimeInicio(g); // Imprime a mensagem de orienta��o para in�cio do jogo.
			auxInicio = true; // Seta a var�avel como true para valida��o do bloco condicional posterior.
		}

		if (auxInicio) { // Var�avel que s� foi setada como true na execu��o anterior a essa.
			if (rodando) { // Vari�vel que foi setada como true na execu��o do m�todo iniciarJogo(), apo�s
							// o acionamento da tecla ENTER.
				// Repons�vel por iterar a constru��o das linhas.
				for (int i = 0; i < ALTURA_TELA / CELULAS; i++) {
					// Pintura das linhas
					g.drawLine(0, i * CELULAS, (LARGURA_TELA - 200) - CELULAS, i * CELULAS); // Constru��o das linhas.
																								// Foi adaptado uma
																								// diminui��o de 1
																								// coluna de c�lulas
																								// parar defini��o
																								// visual do tabuleiro.

					g.drawLine(i * CELULAS, 0, i * CELULAS, ALTURA_TELA); // Constru��o das colunas.

				}

				// Pintura da fruta.
				g.setColor(Color.green);
				g.fillOval(frutaEixoX, frutaEixoY, CELULAS, CELULAS);

				// Executa a itera��o para pintura da cobra.
				for (int i = 0; i < partesCobra; i++) {
					if (i == 0) { // Bloco que testa o �ndice inicial para pintar a cabe�a.
						g.setColor(Color.red);
						g.fillRect(linhas[i], colunas[i], CELULAS, CELULAS);
					} else { // Bloco que executa a pintura do restante do corpo.
						g.setColor(Color.orange);
						g.fillRect(linhas[i], colunas[i], CELULAS, CELULAS);
					}
				}

				// Pintura de mensagem Snake Game no dashboard.
				g.setColor(Color.orange);
				g.setFont(new Font("Calibri", Font.BOLD, 40));
				FontMetrics imp1 = getFontMetrics(g.getFont());
				g.drawString("Snake Game", (LARGURA_TELA - imp1.stringWidth("Snake Game")) / 2 + 288,
						ALTURA_TELA - 560);

				// Pintura de componentes da equipe no dashboard.
				g.setColor(Color.gray);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp2 = getFontMetrics(g.getFont());
				g.drawString("Equipe 07: Ronaldo / William",
						(LARGURA_TELA - imp2.stringWidth("Equipe 07: Ronaldo / William")) / 2 + 276, ALTURA_TELA - 530);

				// Pintura de mensagem dos pontos no dashboard.
				g.setColor(Color.red);
				g.setFont(new Font("Calibri", Font.BOLD, 40));
				FontMetrics imp3 = getFontMetrics(g.getFont());
				g.drawString("Pontos: " + frutasComidas,
						(LARGURA_TELA - imp3.stringWidth("Pontos: " + frutasComidas)) / 2 + 290, ALTURA_TELA / 2 - 50);

				// Pintura de cabe�alho Comandos no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 20));
				FontMetrics imp4 = getFontMetrics(g.getFont());
				g.drawString("Comandos: ", (LARGURA_TELA - imp4.stringWidth("Comandos: ")) / 2 + 236,
						ALTURA_TELA - 160);

				// Pintura de instru��es de direita no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp5 = getFontMetrics(g.getFont());
				g.drawString("Direita: Seta direita / Tecla D",
						(LARGURA_TELA - imp5.stringWidth("Direita: Seta direita / Tecla D")) / 2 + 274,
						ALTURA_TELA - 130);

				// Pintura de instru��es de esquerda no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp6 = getFontMetrics(g.getFont());
				g.drawString("Esquerda: Seta esquerda / Tecla A",
						(LARGURA_TELA - imp6.stringWidth("Esquerda: Seta esqueda / Tecla A")) / 2 + 288,
						ALTURA_TELA - 100);

				// Pintura de instru��es de cima no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp7 = getFontMetrics(g.getFont());
				g.drawString("Cima: Seta cima / Tecla W",
						(LARGURA_TELA - imp7.stringWidth("Cima: Seta cima / Tecla W")) / 2 + 265, ALTURA_TELA - 70);

				// Pintura de instru��es de baixo no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp8 = getFontMetrics(g.getFont());
				g.drawString("Baixo: Seta baixo / Tecla S",
						(LARGURA_TELA - imp8.stringWidth("Baixo: Seta baixo / Tecla S")) / 2 + 266, ALTURA_TELA - 40);

				// Pintura de instru��es de pausa no dashboard.
				g.setColor(Color.white);
				g.setFont(new Font("Calibri", Font.BOLD, 15));
				FontMetrics imp9 = getFontMetrics(g.getFont());
				g.drawString("Pausa/Despausa: Tecla P",
						(LARGURA_TELA - imp9.stringWidth("Baixo: Seta baixo / Tecla S")) / 2 + 266, ALTURA_TELA - 10);

			} else if (auxGameOver) { // Condiciona a impress�o do texto de Game Over ap�s a valida��o da vari�vel.
				imprimeGameOver(g);
			}
		}
	}

	// M�todo respons�vel pela cria��o de novas frutas no tabuleiro.
	public void novaFruta() {
		this.frutaEixoX = random.nextInt((int) ((LARGURA_TELA - 200) / (CELULAS * 2))) * CELULAS;
		this.frutaEixoY = random.nextInt((int) (ALTURA_TELA / CELULAS)) * CELULAS;
	}

	// M�todo repons�vel pela movimenta��o da cobra.
	public void movimentos() {
		// La�o respons�vel pela movimenta��o da cobra no tabuleiro.
		for (int i = partesCobra; i > 0; i--) {
			linhas[i] = linhas[i - 1]; // Respons�vel pela corre��o do �ndice para percorrer as linhas.
			colunas[i] = colunas[i - 1]; // Respons�vel pela corre��o do �ndice parar percorrer as colunas.
		}

		// Condicional que vai atribuir as dire��es nos arrays de linhas e colunas.
		switch (direcao) {
		case 'C':
			colunas[0] -= CELULAS;
			break;
		case 'B':
			colunas[0] += CELULAS;
			break;
		case 'E':
			linhas[0] -= CELULAS;
			break;
		case 'D':
			linhas[0] += CELULAS;
			break;
		}
	}

	// M�todo respons�vel por checar a cria��o de novas frutas.
	public void checarFrutas() {
		if ((linhas[0] == frutaEixoX) && (colunas[0] == frutaEixoY)) { // Testa se a cabe�a da cobra encontra o mesmo
																		// valor de posi��o que a fruta.
			partesCobra++; // Acrescenta um peda�o no corpo da cobra.
			frutasComidas++; // Acrescenta uma fruta no contador.
			novaFruta(); // Executa o m�todo que gera outra fruta.
		}
	}

	// M�todo respons�vel por controlar as colis�es da cobra.
	public void checarColisoes() {
		// La�o que testa a colis�o no pr�prio corpo da cobra.
		for (int i = partesCobra; i > 0; i--) {
			if ((linhas[0] == linhas[i]) && colunas[0] == colunas[i]) {
				rodando = false; // se alterar esse valor o jogador nao perde ao passar pelo corpo
				auxGameOver = true;
			}
		}

		// Bloco que testa a colis�o no lado esquerdo da tela.
		if (linhas[0] < 0) {
			rodando = false;
			auxGameOver = true;
		}

		// Bloco que testa a colis�o no lado direito da tela.
		if (linhas[0] > ((LARGURA_TELA - 200) - CELULAS * 2)) {
			rodando = false;
			auxGameOver = true;
		}

		// Bloco que testa a colis�o na parte superior da tela.
		if (colunas[0] < 0) {
			rodando = false;
			auxGameOver = true;
		}

		// Bloco que testa a colis�o na parte inferior da tela.
		if (colunas[0] > ALTURA_TELA - CELULAS) {
			rodando = false;
			auxGameOver = true;
		}

		// Testa as condi��es das variav�is rodando e auxGameOver e para o timer de
		// execu��o.
		if (rodando == false && auxGameOver == true) {
			timer.stop();
		}
	}

	// M�todo respons�vel pelas impress�es referente ao Game Over do jogo.
	public void imprimeGameOver(Graphics g) {
		// Texto para exibir a mensagem de Game Over.
		g.setColor(Color.white);
		g.setFont(new Font("Calibri", Font.BOLD, 75));
		FontMetrics imp1 = getFontMetrics(g.getFont());
		g.drawString("Game Over!", (LARGURA_TELA - imp1.stringWidth("Game Over!")) / 2, ALTURA_TELA / 2);

		// Texto para exibir a mensagem de pontua��o final.
		g.setColor(Color.red);
		g.setFont(new Font("Calibri", Font.BOLD, 25));
		FontMetrics imp2 = getFontMetrics(g.getFont());
		g.drawString("Voc� acumulou: " + frutasComidas + " ponto(s)",
				(LARGURA_TELA - imp2.stringWidth("Voc� acumulou: " + frutasComidas + " ponto(s)")) / 2,
				ALTURA_TELA / 2 + 50);
	}

	// M�todo respons�vel pelas impress�es referente a Pausa do jogo.
	public void imprimePausa(Graphics g) {
		// Texto para exibir a mensagem de Pausa.
		g.setColor(Color.red);
		g.setFont(new Font("Calibri", Font.BOLD, 75));
		FontMetrics imp2 = getFontMetrics(g.getFont());
		g.drawString("Pausado!", (LARGURA_TELA - imp2.stringWidth("Pausado!")) / 2, ALTURA_TELA / 2);

		// Texto para exibir a mensagem de despausa.
		g.setColor(Color.red);
		g.setFont(new Font("Calibri", Font.BOLD, 25));
		FontMetrics imp3 = getFontMetrics(g.getFont());
		g.drawString("Tecle P para despausar!", (LARGURA_TELA - imp3.stringWidth("Tecle P para despausar!")) / 2,
				ALTURA_TELA / 2 + 50);
	}

	// M�todo respons�vel pelas impress�es referente ao in�cio do jogo.
	public void imprimeInicio(Graphics g) {
		g.setColor(Color.white); // Setar a cor do texto.
		g.setFont(new Font("Calibri", Font.BOLD, 75)); // Setar a formata��o do texto.
		FontMetrics imp1 = getFontMetrics(g.getFont());
		g.drawString("Tecle ENTER para iniciar!", (LARGURA_TELA - imp1.stringWidth("Tecle ENTER para iniciar!")) / 2,
				ALTURA_TELA / 2);
	}

	// M�todo obrigat�rio conhecido como "motor" do jogo. (Sobrescrita necess�ria).
	public void actionPerformed(ActionEvent e) {
		if (rodando) {
			movimentos();
			checarFrutas();
			checarColisoes();
		}
		repaint(); // ***
	}

	// Classe (Interna) repons�vel pelo mapa de teclas, que faz heran�a a classe
	// padr�o KeyAdapter.
	public class MapaTeclas extends KeyAdapter {
		// M�todo existente na classe KeyAdapter que necessita ser sobrescrito.
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {

			// Dire��o esquerda.
			case KeyEvent.VK_LEFT: // Teste de tecla direcional esquerda.
				if (direcao != 'D') { // Testa se n�o h� dire��o oposta referente a tecla pressionada.
					direcao = 'E'; // Atribui a dire��o da tecla pressionada.
				}
				break;
			case KeyEvent.VK_A:
				if (direcao != 'D') {
					direcao = 'E';
				}
				break;

			// Dire��o direita.
			case KeyEvent.VK_RIGHT:
				if (direcao != 'E') {
					direcao = 'D';
				}
				break;
			case KeyEvent.VK_D:
				if (direcao != 'E') {
					direcao = 'D';
				}
				break;

			// Dire��o cima.
			case KeyEvent.VK_UP:
				if (direcao != 'B') {
					direcao = 'C';
				}
				break;
			case KeyEvent.VK_W:
				if (direcao != 'B') {
					direcao = 'C';
				}
				break;

			// Dire��o baixo.
			case KeyEvent.VK_DOWN:
				if (direcao != 'C') {
					direcao = 'B';
				}
				break;
			case KeyEvent.VK_S:
				if (direcao != 'C') {
					direcao = 'B';
				}
				break;

			// Fun��o de pausa.
			case KeyEvent.VK_P:
				if (rodando) { // Condiciona a tecla a funcionar apenas se o jogo estiver rodando.
					if (!auxPausa) { // Condiciona o primeiro acionamento da tecla a parada de execu��o do timer do
										// jogo.
						timer.stop(); // Executa a parada de execu��o do timer do jogo.
						auxPausa = true; // Seta a vari�vel como true para validar o pr�ximo acionamento.
						imprimePausa(getGraphics()); // Executa o m�todo de impress�o do texto de pausa.
					} else { // Condiciona o segundo acionamento da tecla a retomada de execu��o do timer do
								// jogo.
						timer.start(); // Executa a retomada de execu��o do timer do jogo.
						auxPausa = false; // Seta a vari�vel como false para validar o pr�ximo acionamento.
					}
				}
				break;

			// Fun��o de iniciar o jogo.
			case KeyEvent.VK_ENTER:
				if (!rodando && !auxGameOver) {
					iniciarJogo();
				}
				break;
			}
		}
	}
}