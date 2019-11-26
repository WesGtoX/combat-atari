package map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import main.Game;


public class Map_02 {
    
    private Game game;
    private Rectangle[] pieces;

    public static final int Y_OFFSET = 60 + 30;

    public Map_02(Game game) {
        // rectangles that make up the map
        this.game = game;
        pieces = new Rectangle[14];

        // Main frame
        pieces[0] = new Rectangle(0, 60, game.getWidth(), 30);
        pieces[1] = new Rectangle(0, game.getHeight() - 30, game.getWidth(), 30);
        pieces[2] = new Rectangle(0, Y_OFFSET, 30,game.getHeight() - Y_OFFSET - 30);
        pieces[3] = new Rectangle(game.getWidth() - 30, Y_OFFSET, 30, game.getHeight() - Y_OFFSET - 30);

        // Rectangles on top and bottom
        pieces[4] = new Rectangle( game.getWidth() / 2 - 30, 60 + 100, 50, 140 );
        pieces[5] = new Rectangle( game.getWidth() / 2 - 30, game.getHeight() - 30 - 210, 50, 140 );

        // Spawn braces
        pieces[6] = new Rectangle( 30 + 180, ((game.getHeight() - 60) / 2) - 40, 30, 200 );
        pieces[7] = new Rectangle( game.getWidth() - 30 - 180 - 30, ((game.getHeight() - 60) / 2) - 40, 30, 200 );
        pieces[8] = new Rectangle( 180, ((game.getHeight() - 60) / 2) - 40, 30, 30 );
        pieces[9] = new Rectangle( 180, 460, 30, 30 );
        pieces[10] = new Rectangle( game.getWidth() - 30 - 180, ((game.getHeight() - 60) / 2) - 40, 30, 30 );
        pieces[11] = new Rectangle( game.getWidth() - 30 - 180, 460, 30, 30 );

        // Heigh center Rectangles
        pieces[12] = new Rectangle(30 + 300, ( (game.getHeight() - 60) / 2) - 25 + 60, 200, 50);
        pieces[13] = new Rectangle(game.getWidth() - 30 - 300 - 220, ((game.getHeight() - 60) / 2) - 25 + 60, 200, 50);

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
