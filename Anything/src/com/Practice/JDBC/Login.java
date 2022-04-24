// Login subsystem with jdbc and mysql.

package com.Practice.JDBC;

import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Log in");

        JButton b = new JButton("Hello");

        frame.getContentPane().add(b);

        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(100, 100));
        frame.setVisible(true);
    }
}
