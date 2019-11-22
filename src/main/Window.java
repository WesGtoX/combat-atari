package main;

import java.awt.Canvas;
import javax.swing.JFrame;

/**
 *
 * @author Wesley
 */
public class Window extends Canvas {
    public Window(String title, Game game) {
        JFrame frame = new JFrame(title);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
