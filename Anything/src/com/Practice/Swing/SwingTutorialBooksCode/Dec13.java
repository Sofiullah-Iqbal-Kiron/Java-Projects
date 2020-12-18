package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import java.awt.*;

/*
 * BoxLayout:
 * BoxLayout just a updated version of FlowLayout. It can arrange components as flow of vertically or horizontally.
 * The class has four constants: X_AXIS, Y_AXIS, LINE_AXIS, and PAGE_AXIS. The constant X_AXIS is used to create
   a horizontal BoxLayout that lays out all components from left to right. The constant Y_AXIS is used to create
   a vertical BoxLayout that lays out all components from top to bottom.
 */

public class Dec13
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Box Layout");

        JPanel hPanel = new JPanel(); // A horizontal panel.
        BoxLayout boxLayout = new BoxLayout(hPanel, BoxLayout.Y_AXIS);
        hPanel.setLayout(boxLayout);

        for (int i = 0; i < 5; i++)
        {
            JButton demo = new JButton("Button" + (i + 1));
            demo.setPreferredSize(new Dimension(90, 30));
            hPanel.add(demo);
        }

        Container contentPane = frame.getContentPane();
        contentPane.add(hPanel);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

/*
 * JLabel:
 * A JLabel is a label that is used for describe another components property.
 * We can initialize a JLabel with Text and Image(as icon).
 * For show an image, we need a JLabel with Icon.
 * JLabels are unselectable.
 */
class Dec13_B
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        Icon iconForLabel =
                new ImageIcon("C:\\Users\\Hp\\Pictures\\Java WallPaper\\wallpaperflare.com_wallpaper (1)" + ".jpg");
        JLabel textLabel = new JLabel("Text Label"), iconLabel = new JLabel(iconForLabel);
        ;
        textLabel.setVisible(true);
        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.blue);

        Dimension dimensionOfFrame = new Dimension(200, 300);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(textLabel);
        contentPane.add(iconLabel);

        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Dec13_C
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        JTextField nameTextField=new JTextField("Enter your name...");
        JLabel nameLabel=new JLabel("Name: ");
        nameLabel.setDisplayedMnemonic('N');
        nameLabel.setLabelFor(nameTextField);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(nameLabel);
        contentPane.add(nameTextField);

        Dimension dimensionOfFrame = new Dimension(200, 300);

        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}