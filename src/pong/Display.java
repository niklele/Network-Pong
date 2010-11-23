package pong;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import pong.Game;

/**
 * Creates the Game
 * @author nikhil
 *
 */
public class Display{
	
	private static final int GAME_WIDTH = 1000;
	private static final int GAME_HEIGHT = 500;
	
	JFrame gameFrame = new JFrame("network-pong");
	
	public Display(Game g) {
		gameFrame.setSize(GAME_WIDTH, GAME_HEIGHT);
        gameFrame.add(g, BorderLayout.CENTER);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main(String[] args) {
    	Game g = new Game();
        new Display(g);
    }

}
