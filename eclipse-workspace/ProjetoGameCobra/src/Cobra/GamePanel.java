package Cobra;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
//Essa classe herda os atributos e metodos do Jpanel que é a classe de grafico do Java 
public class GamePanel extends JPanel implements ActionListener {
// largura e altura
	static final int SCREEN_WIDTH = 800;
	static final int SCREEN_HEIGHT = 600;
	
	static final int UNIT_SIZE = 20;
	// definindo o tamanho da tela
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
	// velocidade da cobra
	static final int DELAY = 75;
//ponta da cobra	
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	
	// tamanho do corpo
	int bodyParts = 3;
	// definição da comida
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
// metodo que cria a tela e inicializa o jogo
	GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
	//metodo que verifica as teclas clicadas	listener
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	

	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
// A Graphicsclasse é a classe base abstrata para todos os contextos gráficos que permitem que um aplicativo desenhe em componentes que são realizados em vários dispositivos,
//	bem como em imagens fora da tela. fonte docs Oracle
	public void draw(Graphics g) {

		if (running) {
			/*
			 * for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) { g.drawLine(i*UNIT_SIZE, 0,
			 * i*UNIT_SIZE, SCREEN_HEIGHT); g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH,
			 * i*UNIT_SIZE); }
			 */
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

			for (int i = 0; i < bodyParts; i++) {
				if (i == 0) {
					g.setColor(Color.orange);
					// fillOval Preenche uma oval delimitada pelo retângulo especificado com a cor atual.
					// fillRect altera a cabeça da cobra para quadrada
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} else {
					g.setColor(new Color(45, 180, 0));
					
					//alteração de cor da cobra 
					// g.setColor(new
				//	Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillOval (x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
			g.setColor(Color.white); //alteração da cor da pontuaçao
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Pontuação: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2,
					g.getFont().getSize());
		} else {
			gameOver(g);
		}
	}

	public void newApple() {
	appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
		
	}

	public void move() {
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
		y[i] = y[i - 1];
		}

		switch (direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	}

	// metodo para verificar quando a maça é comida e incrementar ao corpo
	public void checkApple() {
		if ((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
		// metodo que verifica se teve colisão 
	public void checkCollisions() {
		// checks if head collides with body
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		}
		// verifica se a cobra bateu na borda esquerda
		if (x[0] < 0) {
			running = false;
		}
		// verifica se a cobra bateu na borda direita
		if (x[0] > SCREEN_WIDTH -1) {
			running = false;
		}
		// verifica se a cobra bateu no topo
		if (y[0] < 0) {
			running = false;
		}
		// verifica se a cobra bateu em baixo
		if (y[0] > SCREEN_HEIGHT -1) {
			running = false;
		}
		// se bater Para
		if (!running) {
			timer.stop();
		}
	}

	//metodo que finaliza o jogo e a pontução
	public void gameOver(Graphics g) {
		// Score
		g.setColor(Color.red);
		//g.setColor(Color.green); essa alteração a pontuação vai mudar para verde na tela do game over
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Pontuação: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: " + applesEaten)) / 2,
				g.getFont().getSize());
		// Game Over text
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);
	}

	//@Override
	public void actionPerformed(ActionEvent e) {

		if (running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
	}

	
	//classe referene ao controle do jogo 
	public class MyKeyAdapter extends KeyAdapter {
		//@Override
		public void keyPressed(KeyEvent e) {
			//switch que verifica que a tecla foi clicada e faz uma acao
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if (direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
}






// https://www-javatpoint-com.translate.goog/Graphics-in-swing?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc

//https://docs-oracle-com.translate.goog/javase/7/docs/api/java/awt/Graphics.html?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc