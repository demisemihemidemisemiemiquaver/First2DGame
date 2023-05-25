package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows window to properly close when "x" button is hit
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        //window.setLocationRelativeTo(null); // window will be displayed at center (since no location is specified)
        window.setVisible(true);

        gamePanel.startGameThread();

        window.pack();
    }
}
