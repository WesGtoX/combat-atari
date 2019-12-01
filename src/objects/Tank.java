package objects;

import static java.awt.event.KeyEvent.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import static java.lang.Math.*;

import main.Game;
import map.Map;
import sounds.PlaySound;
import utils.ResourceLoader;

/**
 *
 * @author Wesley, Lenin
 */
public class Tank {
    
    public static final int DIMENSION = 48;
    
    private double x;
    private double y;
    private double vx;
    private double vy;
    private double angle;
    private double rotVel;
    
    // keyboard variables
    private int upKey;
    private int downKey;
    private int cwKey;
    private int ccKey;
    private int fireKey;
    public int score;

    // moves and rotation variable
    private boolean movingUp;
    private boolean movingDown;
    private boolean rotatingCw;
    private boolean rotatingCc;
    private boolean destroyed;
    
    // tank
    public int player1;
    public int player2;

    // setting tank sprite
    private BufferedImage tankSprite;
    
    // game class
    private Game game;
    // mapa class
    private Map map;
    // bullet class
    private CannonBall bullet;
    
    private Color tankColor;

    public Tank(int x, int y, Color tankColor, Map map, int as, int p1, int p2, Game game) {
        this.x = x;
        this.y = y;
        this.game = game;
        this.map = map;
        
        this.tankColor = tankColor;
        this.player1 = p1;
        this.player2 = p2;
        
        // set move and rotation to false
        movingUp = false;
        movingDown = false;
        rotatingCw = false;
        rotatingCc = false;
        destroyed = false;
        
        bullet = null;
        score = 0;
        
        // setting selected tank to play
        if (this.player1 == 1) {
            if(tankColor == Color.GREEN) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank01.png");
            } else if(tankColor == Color.RED) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank02.png");
            } else if(tankColor == Color.YELLOW) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank03.png");
            } else if(tankColor == Color.BLUE) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank04.png");
            }
            upKey = VK_W;
            downKey = VK_S;
            cwKey = VK_D;
            ccKey = VK_A;
            fireKey = VK_SPACE;
            angle = as;         // player1 = 90
        }
        
        if (this.player2 == 2) {
            if(tankColor == Color.GREEN) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank01.png");
            } else if(tankColor == Color.RED) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank02.png");
            } else if(tankColor == Color.YELLOW) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank03.png");
            } else if(tankColor == Color.BLUE) {
                tankSprite = ResourceLoader.loadImage("images\\hulls_tank04.png");
            }
            upKey = VK_UP;
            downKey = VK_DOWN;
            cwKey = VK_RIGHT;
            ccKey = VK_LEFT;
            fireKey = VK_ENTER;
            angle = as;        // player2 = -90
        }

        vx = 0.0;
        vy = 0.0;
        rotVel = 0.0;
    }
    
    public void update() {
        if(!destroyed) {
            x += vx;
            y += vy;
            angle += rotVel;
            if (movingUp || movingDown) {
                updateVelocity();
            }

            if (bullet != null) bullet.update();

            // set collision
            double right = x + DIMENSION;
            double bottom = y + DIMENSION;
            if (x < 0) x = 0;
            if (y < 0) y = 0;
            if (right > game.getWidth()) x = game.getWidth() - DIMENSION;
            if (bottom > game.getHeight()) y = game.getHeight() - DIMENSION;
        }
    }
    
    public void render(Graphics g) {
        if(!destroyed) {
            Graphics2D g2 = (Graphics2D) g;
            double r = toRadians(angle);
            g2.rotate(r, (DIMENSION / 2.0) + x, (DIMENSION / 2.0) + y);
            g2.drawImage(tankSprite, (int) x, (int) y, game);
            g2.rotate(-r, (DIMENSION / 2.0) + x, (DIMENSION / 2.0) + y);

            if (bullet != null) bullet.render(g);
        }
    }
    
    public void keyPressed(int key) {
        if(key == upKey) {
            movingUp = true;
            movingDown = false;
        } else if(key == downKey) {
            movingDown = true;
            movingUp = false;
        } else if(key == cwKey) {
            rotatingCw = true;
            rotatingCc = false;
            rotVel = 1;
        } else if(key == ccKey) {
            rotatingCc = true;
            rotatingCw = false;
            rotVel = -1;
        } else if(key == fireKey) {
            new PlaySound().play("Shot.wav");
            // make CannonBall in the center of the tank
            double r = toRadians(angle);
            double bx = (x + (DIMENSION / 2.0) - CannonBall.RADIUS) + cos(r);
            double by = (y + (DIMENSION / 2.0) - CannonBall.RADIUS) + sin(r);
            double bvx = 2 * (sin(r));
            double bvy = 2 * (-cos(r));
            bullet = new CannonBall(bx, by, bvx, bvy, tankColor, this, map, game);
        }
    }

    public void destroyCannonBall() {
        bullet = null;
    }
    
    public boolean checkCannonBallCollision(Tank tank) {
        // uses the called tank's bullet and checks its 
        // collision with the tank passed in
        if(bullet == null) {
            // can't collide if there's no bullet
            return false;
        } else {
            Shape tankShape = tank.getBounds();
            Rectangle bulletBounds = bullet.getBounds();
            return tankShape.intersects(bulletBounds);
        }
    }
    
    public boolean checkMapCollision(Map map) {
        // change position to check the next tick's collision
        x += vx;
        y += vy;
        angle += rotVel;
        Shape shape = getBounds();
        // goes through each rectangle in the map and checks collision
        for(Rectangle rect : map.getPieces()) {
            if(shape.intersects(rect)) {
                // undo position change since it was read-only
                x -= vx;
                y -= vy;
                angle -= rotVel;
                return true;
            }
        }
        x -= vx;
        y -= vy;
        angle -= rotVel;
        return false;
    }
    
    public Shape getBounds() {
        AffineTransform at = new AffineTransform();
        at.rotate(toRadians(angle), x + (DIMENSION / 2.0), y + (DIMENSION / 2.0));

        Rectangle rect = new Rectangle((int) x, (int) y, DIMENSION, DIMENSION);
        // create shape based on rect with 
        // rotations set in the affinetransform
        return at.createTransformedShape(rect);
    }
    
    public void destroy() {
        destroyed = true;
    }
    
    public void respawn(int x, int y, int angle) {
        // respawn to defaul location
        destroyed = false;
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
    
    public void keyReleased(int key) {
        if(key == upKey && !movingDown) {
            movingUp = false;
            vy = 0;
            vx = 0;
        } else if(key == downKey && !movingUp) {
            movingDown = false;
            vy = 0;
            vx = 0;
        } else if(key == cwKey && !rotatingCc) {
            rotVel = 0;
            rotatingCw = false;
        } else if(key == ccKey && !rotatingCw) {
            rotatingCc = false;
            rotVel = 0;
        }
    }
    
    public void updateVelocity() {
        if(movingUp) {
            double r = toRadians(angle);
            r = -r;
            r += PI / 2;    // 90 degrees in radians
            double cos = cos(r);
            double sin = sin(r);
            vx = cos;
            vy = -sin;
        }
        if(movingDown) {
            double r = toRadians(angle);
            r = -r;
            r += PI / 2;    // 90 degrees in radians
            double cos = cos(r);
            double sin = sin(r);
            vx = -cos;
            vy = sin;
        }
    }
    /*
    public void deathAnimation(){
        tankSprite = ResourceLoader.loadImage("images\\explosion.png");
    }
    */
    public String getScoreString() {
        return "" + score;
    }
    
    public void addScore() {
        score += 1;
    }
}
