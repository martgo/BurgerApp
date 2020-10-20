package com.burgerApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Burgers extends JPanel implements ActionListener {
    JLabel logoLabel, textLabel;
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
        textLabel = new JLabel("BEST BURGERS ON ORDER ", SwingConstants.CENTER);
        textLabel.setFont(new Font("SignPainter", Font.BOLD, 30));
        textLabel.setBounds(120, 5, 300, 100);
        textLabel.setForeground(Color.black);
        add(textLabel);

        quitButton = new JButton("QUIT");
        quitButton.setFont(new Font("Phosphate", Font.ITALIC, 20));
        quitButton.setBounds(180,400,150,50);
        quitButton.setHorizontalAlignment(JButton.CENTER);
        quitButton.setForeground(Color.RED);
//        quitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.exit(0);
//            }
//        });
        add(quitButton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}