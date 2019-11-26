package map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import main.Game;

/**
 * @author Lenin
 * @author Wesley
 */
public class Map_03 {
    
    private Game game;
    private Rectangle[] pieces;

    public static final int Y_OFFSET = 60 + 30;

    public Map_03(Game game) {
        // rectangles that make up the map
        this.game = game;
        pieces = new Rectangle[4];

        // Main frame
        pieces[0] = new Rectangle(0, 60, game.getWidth(), 30);
        pieces[1] = new Rectangle(0, game.getHeight() - 30, game.getWidth(), 30);
        pieces[2] = new Rectangle(0, Y_OFFSET, 30,game.getHeight() - Y_OFFSET - 30);
        pieces[3] = new Rectangle(game.getWidth() - 30, Y_OFFSET, 30, game.getHeight() - Y_OFFSET - 30);

    }

    public Rectangle[] getPieces() {
        return pieces;
    }

    public void render(Graphics g) {
        for(Rectangle piece : pieces) {
            g.setColor(Color.BLACK);
            g.fillRect(piece.x, piece.y, piece.width, piece.height);
        }
    }
}
