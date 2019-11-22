package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import main.Game;
import map.Map;

/**
 *
 * @author Wesley
 */
public class CannonBall {

    static final double RADIUS = 5.0;

    private double x;
    private double y;
    private double vx;
    private double vy;

    private int nCollisions;

    private Game game;
    private Tank tank;
    private Map map;
    
    private Color cannonBallColor;
    
   CannonBall(double x, double y, double vx, double vy, Color cannonBallColor, Tank tank, Map map, Game game) {
        this.x = x;
        this.y = y;
        this.cannonBallColor = cannonBallColor;
        this.tank = tank;
        this.game = game;
        this.map = map;
        
        // setting CannonBall velocities based on tank direction
        this.vx = 3 * vx;
        this.vy = 3 * vy;
    }
   
    void update() {
        // set collision
        final int centerX = (int)x + (int)RADIUS;
        final int centerY = (int)y + (int)RADIUS;
        for(Rectangle mapRect : map.getPieces()) {
            final int mapRight = mapRect.x + mapRect.width;
            final double mapBottom = mapRect.y + mapRect.height;

            if(getBounds().intersects(mapRect)) {
                // check for x and y collision
                if (centerX > mapRect.x && centerX < mapRight) {
                    // y collision
                    vy = -vy;
                } else if (centerY > mapRect.y && centerY < mapBottom) {
                    // x collision
                    vx = -vx;
                }
                nCollisions++;
            }
        }

        // set the amount of collisions
        if(nCollisions == 3) {
            tank.destroyCannonBall();
        }

        x += vx;
        y += vy;
    }

    Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, (int)(RADIUS * 2), (int)(RADIUS * 2));
    }
    
    void render(Graphics g) {
        g.setColor(cannonBallColor);
        g.fillArc((int) x, (int) y, (int) RADIUS * 2, (int) RADIUS * 2, 0, 360);
    }
}
