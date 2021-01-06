package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

/* Grid Layout:
 * Arranges components in rectangular places.
 * Arranges components horizontally then vertically.
 * Only number of rows or number of cols is acceptable. n(row) is preferable.
 * Good if wanna same sized components. As: "OK" and "Cancel" button if we want that both must be same sized.
 * Specify container orientation is good practice.
 * n(cols) = ( n(comps) + n(rows) - 1 ) / n(rows)
 * n(rows) = ( n(comps) + n(cols) - 1) / n(cols)
 * Can specify horizontal gap - hGap() and vertical gap - vGap() in pixel.
 * Components are resizeable with main window/frame.
 *
 * Drawbacks:
 * Can not specify exact location for a component to be placed.
 * Force each component to be same sized.
 */

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Jan2
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Grid Layout Illustration");

        LayoutManager gridLayout = new GridLayout(3, 0, 10, 20);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(gridLayout);

        for (int i = 0; i < 8; i++)
            contentPane.add(new JButton("Button " + (i + 1)));

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

/* JSpinner:
 * Combination of JEditableTextField and JComboBox
 * Provide model to this.
 * Three models are available that extends SpinnerModel interface.
 * SpinnerNumberModel, SpinnerDateModel, SpinnerListModel.
 * SpinnerNumberModel(currentValue, minValue, maxValue, steps);
 */

class Jan2_B
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Grid Layout Illustration");

        SpinnerModel nModel = new SpinnerNumberModel(1, 0, 11, 1);
        SpinnerModel dModel = new SpinnerDateModel();
        SpinnerModel lModel = new SpinnerListModel(new String[] {"Winter", "Summer", "Fall", "Spring"});

        JSpinner numberSpinner = new JSpinner(), dateSpinner = new JSpinner(), listSpinner = new JSpinner();
        numberSpinner.setModel(nModel);
        dateSpinner.setModel(dModel);
        listSpinner.setModel(lModel);

        LayoutManager LMforContentPane = new GridLayout(0, 2);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(LMforContentPane);
        contentPane.add(numberSpinner);
        contentPane.add(dateSpinner);
        contentPane.add(listSpinner);

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}