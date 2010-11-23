package pong;

import pong.*;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * Controls the Ball and the 2 Players and draws everything.
 * 100 x 50 grid (x10 pixels/unit)
 * @author nikhil
 */
public class Game extends JComponent{
	
	public static final int SLEEP_TIME = 100;
	
	private Player player1;
	private Player player2;
	private Ball ball;
	
	private boolean isFieldContrast;
	
	public Game() {
		setFocusable(true);
//		addKeyListener(this);
		
		player1 = new Player(0, 100, Player.LEFT_SIDE);
		player2 = new Player(0, 200, Player.RIGHT_SIDE);
		ball = new Ball(500, 300);
		
		play();
	}
	
	private void play() {
		try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        moveBall();
        repaint();
	}
	
	private void moveBall() {
		ball.setX((int) ball.getVx() * SLEEP_TIME);
		ball.setY((int) ball.getVy() * SLEEP_TIME);
		
		if(ball.getY() < 10) {
			System.out.println("ball y = " + ball.getY());
			ball.bounce();
		} else if(ball.getY() > 490) {
			System.out.println("ball y = " + ball.getY());
			ball.bounce();
		}
		
		if(ball.getX() < 10) {
			System.out.println("ball x = " + ball.getX());
			player2.incrementScore();
		} else if(ball.getX() > 990) {
			System.out.println("ball x = " + ball.getX());
			player1.incrementScore();
		}
	}
	
	private void setContrast(boolean contrast) {
		player1.setContrast(contrast);
		player2.setContrast(contrast);
		ball.setContrast(contrast);
		isFieldContrast = contrast;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		player1.draw(g);
		player2.draw(g);
		ball.draw(g);
	}

}
