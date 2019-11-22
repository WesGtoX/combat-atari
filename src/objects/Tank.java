package objects;

import static java.awt.event.KeyEvent.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static java.lang.Math.*;

import main.Game;
import map.Map;
import utils.ResourceLoader;

/**
 *
 * @author Wesley
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
    private int score;

    // moves and rotation variable
    private boolean movingUp;
    private boolean movingDown;
    private boolean rotatingCw;
    private boolean rotatingCc;
    private boolean destroyed;

    // setting tank sprite
    private BufferedImage tankSprite;
    
    // game class
    private Game game;
    // mapa class
    private Map map;
    // bullet class
    private CannonBall bullet;
    
    private Color tankColor;

    public Tank(int x, int y, Color tankColor, Map map, Game game) {
        this.x = x;
        this.y = y;
        this.game = game;
        this.map = map;
        this.tankColor = tankColor;
        
        // set move and rotation to false
        movingUp = false;
        movingDown = false;
        rotatingCw = false;
        rotatingCc = false;
        destroyed = false;
        
        bullet = null;
        score = 0;
        
        // setting selected tank to play
        if(tankColor == Color.BLUE) {
            tankSprite = ResourceLoader.loadImage("images/BlueTank.png");
            upKey = VK_W;
            downKey = VK_S;
            cwKey = VK_D;
            ccKey = VK_A;
            fireKey = VK_SPACE;
            angle = 90;
        } else if(tankColor == Color.GREEN) {
            tankSprite = ResourceLoader.loadImage("images/GreenTank.png");
            upKey = VK_UP;
            downKey = VK_DOWN;
            cwKey = VK_RIGHT;
            ccKey = VK_LEFT;
            fireKey = VK_ENTER;
            angle = -90;
        } else tankSprite = null;

        vx = 0.0;
        vy = 0.0;
        rotVel = 0.0;
    }
    
    public void destroyCannonBall() {
        bullet = null;
    }
    
}
