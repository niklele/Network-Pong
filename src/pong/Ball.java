package pong;

import pong.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Representation of the ball being passed between the two Players.
 * @author nikhil
 *
 */
public class Ball {
	
	public static final int BALL_SIZE = 10;
	
	public static final Color DEFAULT_COLOR = Color.BLACK;
	public static final Color CONTRAST_COLOR = Color.WHITE;
		
	//x and y position
	private int x;
	private int y;
	
	//components of velocity in x and y directions
	private double vx;
	private double vy;
	
	private Color c;
	
	private boolean isContrast = false;
	
	/**
	 * Creates a Ball at x, y position and vx = vy = 1
	 * @param x
	 * @param y
	 */
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.vx = 1;
		this.vy = 1;
	}
	
	public Ball(int x, int y, double vx, double vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(x - BALL_SIZE / 2, y - BALL_SIZE / 2, BALL_SIZE, BALL_SIZE);
	}
	
	public void setContrast(boolean contrast) {
		isContrast = contrast;
		c = (isContrast) ? CONTRAST_COLOR : DEFAULT_COLOR;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getVx() {
		return vx;
	}

	public double getVy() {
		return vy;
	}
	
	public void setVx(int x) {
		vx = (this.x - x) * Game.SLEEP_TIME;
		this.x = x;
	}

	public void setVy(int y) {
		vy = (this.y - y) * Game.SLEEP_TIME;
		this.y = y;
	}
	
	public void bounce() {
		vy *= -1;
	}

}
