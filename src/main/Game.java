package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import keyboard.KeyInput;
import map.Map;
import objects.Tank;

/**
 *
 * @author Wesley, Lenin
 */
public class Game extends Canvas implements Runnable {
    
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final String TITLE = "Combat Atari";

    private boolean running;
    private Thread thread;

    private Tank player1;
    private Tank player2;
    public int tank1_color;
    public int tank2_color;
    public int color_select;
    
//    private Tank blueTank;
//    private Tank greenTank;

    private Map map;
    public int map_select;
    
    public Game(int mp, int ts1, int ts2) {
        this.map_select = mp;
        this.tank1_color = ts1;
        this.tank2_color = ts2;

        running = false;
        setSize(new Dimension(WIDTH, HEIGHT));
        new Window(TITLE, this);
        addKeyListener(new KeyInput(this));

        // MAP
        int tankY = (HEIGHT / 2) - (Tank.DIMENSION / 2) + 30;
        if(this.map_select == 1) {
            map = new Map(this);
        } else if(this.map_select == 2) {
            map = new Map(this, 2);
        } else if(this.map_select == 3) {
            map = new Map(this, 2, 3);
        }
        
        // PLAYER 1
        if(this.tank1_color == 1) {
            // tank green
            player1 = new Tank(60, tankY, Color.GREEN, map, 90, 1, 0, this);
        } else if(this.tank1_color == 2) {
            // tank red
            player1 = new Tank(60, tankY, Color.RED, map, 90, 1, 0, this);
        } else if(this.tank1_color == 3) {
            // tank yellow
            player1 = new Tank(60, tankY, Color.YELLOW, map, 90, 1, 0, this);
        } else if(this.tank1_color == 4) {
            // tank blue
            player1 = new Tank(60, tankY, Color.BLUE, map, 90, 1, 0, this);
        }
        
        // PLAYER 2
        if(this.tank2_color == 1) {
            // tank green
            player2 = new Tank(WIDTH - 60 - Tank.DIMENSION, tankY, Color.GREEN, map, -90, 0, 2, this);
        } else if(this.tank2_color == 2) {
            // tank red
            player2 = new Tank(WIDTH - 60 - Tank.DIMENSION, tankY, Color.RED, map, -90, 0, 2, this);
        } else if(this.tank2_color == 3) {
            // tank yellow
            player2 = new Tank(WIDTH - 60 - Tank.DIMENSION, tankY, Color.YELLOW, map, -90, 0, 2, this);
        } else if(this.tank2_color == 4) {
            // tank blue
            player2 = new Tank(WIDTH - 60 - Tank.DIMENSION, tankY, Color.BLUE, map, -90, 0, 2, this);
        }
    }
    
    @Override
    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        double delta = 0.0;
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        int frames = 0;

        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                update();
                delta--;
            }
            if(running) {
                render();
                frames++;
            }
            if(System.currentTimeMillis() - timer >= 1000) {
//                System.out.println("[FPS] " + frames);
                frames = 0;
                timer += 1000;
            }
        }
        stop();
    }

    public void update() {
        if(!player2.checkMapCollision(map)) {
            // if no collisions happened
            player2.update();
        }
        if(!player1.checkMapCollision(map)) {
            // if no collisions happened
            player1.update();
        }
        if(player2.checkCannonBallCollision(player1)) {
            player2.destroyCannonBall();
            player1.destroy();
            player2.addScore();
            int tankY = (HEIGHT / 2) - (Tank.DIMENSION / 2) + 30;
            player1.respawn(60, tankY, 90);
//            if (player1.score == 1) running = false;
//            MenuEnd end = new MenuEnd();
//            end.setVisible(true);
        }
        if(player1.checkCannonBallCollision(player2)) {
            player1.destroyCannonBall();
            player2.destroy();
            player1.addScore();
            int tankY = (HEIGHT / 2) - (Tank.DIMENSION / 2) + 30;
            player2.respawn(WIDTH - 60 - Tank.DIMENSION, tankY, -90);
//            if (player2.score == 1) running = false;
//            MenuEnd end = new MenuEnd();
//            end.setVisible(true);
        }
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        player2.render(g);
        player1.render(g);

        // draw scores
        g.setColor(Color.GREEN);
        g.setFont(new Font("Veradana", Font.PLAIN, 50));
        g.drawString(player1.getScoreString(), 30, 50);
        g.setColor(Color.RED);
        g.drawString(player2.getScoreString(), WIDTH - 60, 50);

        g.setColor(Color.YELLOW);

        map.render(g);

        g.dispose();
        bs.show();
    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized  void stop() {
        running = false;
        try {
            System.out.println("try");
            thread.join();
        } catch(InterruptedException e) {
            System.out.println("cath");
            e.printStackTrace();
        }
    }

    public void keyPressed(int key) {
        player1.keyPressed(key);
        player2.keyPressed(key);
    }

    public void keyReleased(int key) {
        player1.keyReleased(key);
        player2.keyReleased(key);
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
//    public static void main(String[] args) {
//        new Game().start();
//    }
}
