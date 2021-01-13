package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

// shift + enter: to go to new line without breaking any line.

/* BoxLayout:
 * BoxLayout arranges components either horizontally(X_AXIS, LINE_AXIS) or vertically(Y_AXIS, PAGE_AXIS).
 * Pass any of the constant in a BoxLayout constructor: X_AXIS-0, Y_AXIS-1, LINE_AXIS-2 or PAGE_AXIS-3.
 * LINE_AXIS and PAGE_AXIS depends on container orientation.
 * Constructor: BoxLayout(Container con[target], BoxLayoutConstant[int] axis);
 */

/**
 * Dimension object just only constructed with width and height.
 */

import javax.swing.*;
import java.awt.*;

public class BoxLayoutPractice
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("BoxLayout");

        Container contentPane = frame.getContentPane();
        Container hPanel = new JPanel();
        Container vPanel = new JPanel();

        BoxLayout layoutFor_hPanel = new BoxLayout(hPanel, BoxLayout.X_AXIS);
        BoxLayout layoutFor_vPanel = new BoxLayout(vPanel, BoxLayout.Y_AXIS);

//        Manually setting the layout for hPanel and vPanel. Is is essential?
        hPanel.setLayout(layoutFor_hPanel);
        vPanel.setLayout(layoutFor_vPanel);

//        hPanel modifying.
        hPanel.setBackground(Color.green);
        hPanel.setPreferredSize(new Dimension(200, 200));

//        vPanel modifying.
        vPanel.setBackground(Color.red);
        vPanel.setPreferredSize(new Dimension(200, 200));

//        Adding components(Three buttons) to hPanel.
        hPanel.add(new JButton("hOne"));
        hPanel.add(new JButton("hTwo"));
        hPanel.add(new JButton("hThree"));

//        Adding components(Three buttons) to vPanel.
        vPanel.add(new JButton("vOne"));
        vPanel.add(new JButton("vTwo"));
        vPanel.add(new JButton("vThree"));

//        Adding components to contentPane.
        contentPane.setLayout(new FlowLayout());
        contentPane.add(hPanel);
        contentPane.add(vPanel);

//        Main top-level window frame modifying.
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
