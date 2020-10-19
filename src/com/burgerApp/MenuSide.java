package com.burgerApp;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuSide extends JPanel implements ActionListener {
    JLabel logoLabel;
    JPanel buttonPanel;
    JButton quitButton, menuButton, snacksButton, beveragesButton;
    private ImageIcon logoImage;

    public MenuSide() throws IOException{
        setLayout(null);
        Color color = new Color(239, 211, 138);
        setBackground(color);
        logoImage = new ImageIcon("src/resources/BurgerAppIcon.png");
        logoLabel = new JLabel(logoImage);
        logoLabel.setBounds(150,10,200,200);
        add(logoLabel);
        //buttons
        menuButton = new JButton("BURGERS");
        menuButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        menuButton.setBounds(180,250,150,50);
        menuButton.setHorizontalAlignment(JButton.CENTER);
        menuButton.setForeground(Color.RED);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getActionCommand().equals("BURGERS")){
                    JFrame frameMenu = new JFrame();
                    frameMenu.setPreferredSize(new Dimension(500, 500));
                    frameMenu.setTitle("BURGERAPP BURGERS");
                    frameMenu.setResizable(false);
                    frameMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frameMenu.pack();
                    frameMenu.setLocationRelativeTo(null);
                    frameMenu.setVisible(true);
                }
            }
        });
        add(menuButton);

        snacksButton = new JButton("SNACKS");
        snacksButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        snacksButton.setBounds(180,300,150,50);
        snacksButton.setHorizontalAlignment(JButton.CENTER);
        snacksButton.setForeground(Color.RED);
        snacksButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getActionCommand().equals("SNACKS")){
                JFrame frameSnacks = new JFrame();
                frameSnacks.setPreferredSize(new Dimension(500, 500));
                frameSnacks.setTitle("BURGERAPP SNACKS");
                frameSnacks.setResizable(false);
                frameSnacks.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frameSnacks.pack();
                frameSnacks.setLocationRelativeTo(null);
                frameSnacks.setVisible(true);
            }
        }
    });
        add(snacksButton);

        beveragesButton = new JButton("BEVERAGES");
        beveragesButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        beveragesButton.setBounds(180,350,150,50);
        beveragesButton.setHorizontalAlignment(JButton.CENTER);
        beveragesButton.setForeground(Color.RED);
        beveragesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getActionCommand().equals("BEVERAGES")){
                    JFrame frameBeverages = new JFrame();
                    frameBeverages.setPreferredSize(new Dimension(500, 500));
                    frameBeverages.setTitle("BURGERAPP BEVERAGES");
                    frameBeverages.setResizable(false);
                    frameBeverages.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frameBeverages.pack();
                    frameBeverages.setLocationRelativeTo(null);
                    frameBeverages.setVisible(true);
                } }
        });
        add(beveragesButton);
//
        quitButton = new JButton("QUIT");
        quitButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        quitButton.setBounds(180,400,150,50);
        quitButton.setHorizontalAlignment(JButton.CENTER);
        quitButton.setForeground(Color.RED);
        quitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });
        add(quitButton);
}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


    }
}
