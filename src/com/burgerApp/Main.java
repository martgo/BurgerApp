package com.burgerApp;

import javax.swing.*;
import java.awt.*;

public class Main {
    public Main(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setPreferredSize(new Dimension(500, 500));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Burger App");
        frame.setLocation(50, 50);
        frame.pack();
        frame.setVisible(true);
        ImageIcon burgerAppIcon = new ImageIcon("/src/resources/BurgerAppIcon.png");
        frame.setIconImage(burgerAppIcon.getImage());
    }
    public static void main(String[] args) {
        new Main();
    }
}
