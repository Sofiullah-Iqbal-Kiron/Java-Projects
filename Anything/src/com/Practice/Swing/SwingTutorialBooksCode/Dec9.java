package com.Practice.Swing.SwingTutorialBooksCode;

/*
 * Let's make some fun with Icon.
 * Icon used for decorate components.
 * Icon: a fixed-sized picture.
 * An icon is an object tha adheres to the Icon interface.
 * ImageIcon class implements Icon interface and that can paint an icon for us from GIF, JPEG and PNG image.
 * Icon interface has a method as: void paintIcon(Component c, Graphics g, int x, int y).
 * In the file path name URL, use double back slash cause java string assumes that, single slash is escape char.
 */

import javax.swing.*;
import java.awt.*;

public class Dec9
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        Container contentPane = frame.getContentPane();

//        Both filePath are valid. Forward slash works on every platform.
        String filePathURL1 = "C:\\Users\\Hp\\Pictures\\Java Swing\\Back play button icon.jpg", filePathURL2 = "C:/Users/Hp" +
                "/Pictures/Java Swing/Back play button icon.jpg";
        Icon iconForJButton = new ImageIcon(filePathURL1);

        contentPane.add(new JButton("Icon", iconForJButton));

        frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
