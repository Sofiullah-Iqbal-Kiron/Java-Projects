package com.Practice.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageApp {
    private static JFrame frame = new JFrame("Image Processing");
    private static Container contentPane = frame.getContentPane();

    private static Image food;

    private static void loadImage() {
        try {
//            This image is a buffered image. ImageIO.read(File file) returns the specified image as a buffered image.
            food = ImageIO.read(new File("C:\\Users\\Hp\\Documents\\Java " + "Projects" + "\\Anything\\src\\com" +
                    "\\Practice\\Image\\food.jpg"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        loadImage();
        contentPaneSetting();
        frameSetting();
    }

    private static void contentPaneSetting() {
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("Button1"));
        contentPane.add(new JButton("Button2"));
        contentPane.add(new JButton("Button3"));
        contentPane.add(new JButton("Button4"));
    }

    private static void frameSetting() {
//        For the first time, I changed the icon image of the top level frame.
        frame.setIconImage(food);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}