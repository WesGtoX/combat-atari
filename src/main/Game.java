package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import keyinput.KeyInput;
import map.Map;
import objects.Tank;

/**
 *
 * @author Wesley
 */
public class Game extends Canvas implements Runnable {
    
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final String TITLE = "Combat Atari";

    private boolean running;
    private Thread thread;

    private Tank greenTank;;
    private Tank redTank;
    private Tank yellowTank;
    private Tank blueTank;

    private Map map;
    
    public Game() {
        running = false;
        setSize(new Dimension(WIDTH, HEIGHT));
        new Window(TITLE, this);
        addKeyListener(new KeyInput(this));

        int tankY = (HEIGHT / 2) - (Tank.DIMENSION / 2) + 30;

        map = new Map(this);
        blueTank = new Tank(60, tankY, Color.BLUE, map,this);
        greenTank = new Tank(WIDTH - 60 - Tank.DIMENSION, tankY, Color.GREEN, map,this);
    }
    @Override
    public void run() {

    }

}
