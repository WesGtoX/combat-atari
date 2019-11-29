package map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import main.Game;

/**
 *
 * @author Wesley, Lenin
 */
public class Map {
    
    private Game game;
    private Rectangle[] pieces;

    public static final int Y_OFFSET = 60 + 30;

    public Map(Game game) {
        // rectangles that make up the map
        this.game = game;
        pieces = new Rectangle[26];

        // Main frame
        pieces[0] = new Rectangle(0, 60, game.getWidth(), 30);
        pieces[1] = new Rectangle(0, game.getHeight() - 30, game.getWidth(), 30);
        pieces[2] = new Rectangle(0, Y_OFFSET, 30,game.getHeight() - Y_OFFSET - 30);
        pieces[3] = new Rectangle(game.getWidth() - 30, Y_OFFSET, 30, game.getHeight() - Y_OFFSET - 30);

        // Squares on top and bottom borders
        pieces[4] = new Rectangle( game.getWidth() / 2 - 20, 60 + 30, 40, 50 );
        pieces[5] = new Rectangle( game.getWidth() / 2 - 20, game.getHeight() - 30 - 50, 40, 50 );

        // Inner corner rectangles
        pieces[6] = new Rectangle( 30 + 180, Y_OFFSET + 90, 80, 30 );
        pieces[7] = new Rectangle( 30 + 180, game.getHeight() - 30 - 90 - 30, 80, 30 );
        pieces[8] = new Rectangle( game.getWidth() - 30 - 180 - 80, Y_OFFSET + 90, 80, 30 );
        pieces[9] = new Rectangle( game.getWidth() - 30 - 180 - 80, game.getHeight() - 30 - 90 - 30, 80, 30 );

        // Spawn braces
        pieces[10] = new Rectangle( 30 + 180, ((game.getHeight() - 60) / 2) - 40, 30, 200 );
        pieces[11] = new Rectangle( game.getWidth() - 30 - 180 - 30, ((game.getHeight() - 60) / 2) - 40, 30, 200 );
        pieces[12] = new Rectangle( 180, ((game.getHeight() - 60) / 2) - 40, 30, 30 );
        pieces[13] = new Rectangle( 180, 460, 30, 30 );
        pieces[14] = new Rectangle( game.getWidth() - 30 - 180, ((game.getHeight() - 60) / 2) - 40, 30, 30 );
        pieces[15] = new Rectangle( game.getWidth() - 30 - 180, 460, 30, 30 );

        // Central squares
        pieces[16] = new Rectangle(30 + 300, ((game.getHeight() - 60) / 2) - 25 + 60, 50, 50);
        pieces[17] = new Rectangle(game.getWidth() - 30 - 300 - 50, ((game.getHeight() - 60) / 2) - 25 + 60, 50, 50);

        // Center corner pieces
        pieces[18] = new Rectangle( 30 + 420, Y_OFFSET + 140, 80, 30 );
        pieces[19] = new Rectangle( game.getWidth() - 80 - 30 - 420, Y_OFFSET + 140, 80, 30 );
        pieces[20] = new Rectangle( 30 + 420, game.getHeight() - 30 - 140, 80, 30 );
        pieces[21] = new Rectangle( game.getWidth() - 80 - 30 - 420, game.getHeight() - 30 - 140, 80, 30 );
        pieces[22] = new Rectangle( 30 + 420, Y_OFFSET + 140 + 30, 30, 30 );
        pieces[23] = new Rectangle( 30 + 420, game.getHeight() - 30 - 140 - 30, 30, 30 );
        pieces[24] = new Rectangle( game.getWidth() - 30 - 30 - 420, Y_OFFSET + 140 + 30, 30, 30 );
        pieces[25] = new Rectangle( game.getWidth() - 30 - 30 - 420, game.getHeight() - 30 - 140 - 30, 30, 30 );
    }
    
    public Map(Game game, int nd) {
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

    public Map(Game game, int nd, int rd) {
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
