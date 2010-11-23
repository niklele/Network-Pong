package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Players are the paddles that hit the ball.
 * @author nikhil
 *
 */
public class Player implements KeyListener{
	
	public static final Color DEFAULT_COLOR = Color.BLACK;
	public static final Color CONTRAST_COLOR = Color.WHITE;
	
	public static final int LEFT_POSITION = 50;
	public static final int RIGHT_POSITION = 900;
	
	public static final boolean LEFT_SIDE = true;
	public static final boolean RIGHT_SIDE = false;
	
	public static final int PLAYER_HEIGHT = 50;
	public static final int PLAYER_WIDTH = 10;
	
	private int score;
	private int position; //vertical position of the center mapping 50-450 to 1-10
	private boolean isLeft;
	private boolean isContrast;
	private Color c;
	
	private int x;
	
	public Player(int score, int position, boolean side) {
//		addKeyListener(this);
		this.score = score;
		this.position = position;
		this.isLeft = side;
		x = (isLeft) ? LEFT_POSITION : RIGHT_POSITION;
	}
	
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(x, position - PLAYER_HEIGHT / 2, PLAYER_WIDTH, PLAYER_HEIGHT);
	}
	
	public void setContrast(boolean contrast) {
		isContrast = contrast;
		c = (isContrast) ? CONTRAST_COLOR : DEFAULT_COLOR;
	}

	public int getScore() {
		return score;
	}

	public void incrementScore() {
		score++;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("KeyCode: " + e.getKeyCode());
		
//		switch (e.getKeyCode()) {
//        	case KeyEvent.VK_DOWN:
//        		System.out.println("down arrow key pressed");
//        		break;
//		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

}
