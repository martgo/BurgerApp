package com.burgerApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Burgers extends JPanel implements ActionListener {
    JLabel logoLabel;
    JPanel buttonPanel;
    JButton quitButton, menuButton, snacksButton, beveragesButton;
    private ImageIcon logoImage;

    public Burgers() throws IOException {
        setLayout(null);
        Color color = new Color(239, 211, 138);
        setBackground(color);
        logoImage = new ImageIcon("src/resources/BurgerAppSmall.png");
        logoLabel = new JLabel(logoImage);
        logoLabel.setBounds(15, 10, 100, 100);
        add(logoLabel);
        //buttons
        menuButton = new JButton(" ");
        menuButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        menuButton.setBounds(0, 250, 150, 50);
        menuButton.setHorizontalAlignment(JButton.CENTER);
        menuButton.setForeground(Color.RED);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getActionCommand().equals("BURGERS")) {
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