package com.burgerApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.channels.NotYetBoundException;
import java.security.PrivateKey;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        JPanel menuSide = new MenuSide();
        JLabel logo = new JLabel();
        frame.setPreferredSize(new Dimension(500, 500));
        frame.add(menuSide);
        frame.setTitle("Burger App");
        frame.setLocation(50, 50);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
