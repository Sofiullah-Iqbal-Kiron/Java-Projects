package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

/* Grid Layout practice:
 * A grid layout arranges components in a rectangular grid of equally sized cells.
 * Each component placed in exactly one cell.
 */

import javax.swing.*;
import java.awt.*;

public class Jan1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        GridLayout gridLayout = new GridLayout();

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
