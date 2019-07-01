/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Rajat Sharma
 */
public class GameWindow extends JFrame{
    
    public static final int SCREEN_WIDTH=900;
    private GameScreen gameScreen;
        
    public GameWindow()
    {
        super("Java T-Rex game");
        setSize(SCREEN_WIDTH,300);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        gameScreen = new GameScreen();
        addKeyListener((KeyListener) gameScreen);
        add(gameScreen);
    }
    
    public void startGame()
    {
        setVisible(true);
        gameScreen.startGame();
    }
    
    public static void main(String args[])
    {
    GameWindow gw = new GameWindow();
   // gw.setVisible(true);
    gw.startGame();
    }
     /*   private void addKeyListener(GameScreen gameScreen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
