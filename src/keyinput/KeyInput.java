package keyinput;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import main.Game;

/**
 *
 * @author Wesley
 */
public class KeyInput extends KeyAdapter {
    
    private Game game;
    
    public KeyInput(Game game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        game.keyPressed(key);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        game.keyReleased(key);
    }
}
