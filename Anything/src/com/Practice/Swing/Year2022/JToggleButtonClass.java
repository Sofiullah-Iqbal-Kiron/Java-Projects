/*
 * JToggleButton is one kind of button but not like normal jbutton.
 * It has two state: depressed - selected state and undepressed - unselected state.
 * JToggleButton toggles between depressed and undepressed state.
 * Basically used to choose a choice from a mutually exclusive choice list.
 * List of choices with a titled border.
 */


package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class JToggleButtonClass {
    private static JFrame frame = new JFrame("JToggleButton Demonstration");
    private static Container contentPane = frame.getContentPane();

    private static JPanel togglePanel = createTogglePanel();

    public static void main(String[] args) {
        contentPaneSetting();
        frameSetting();
    }

    private static void contentPaneSetting() {
        contentPane.setLayout(new FlowLayout());
        contentPane.add(togglePanel);
    }

    private static JPanel createTogglePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        ButtonGroup buttonGroup = new ButtonGroup();
        Box vBox = Box.createVerticalBox();
        vBox.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//            Create a toggle button
            JToggleButton tb = new JToggleButton(info.getName());

//            Make it mutually exclusive.
            buttonGroup.add(tb);

//            Add it on a box container.
            vBox.add(tb);
            vBox.add(Box.createRigidArea(new Dimension(3, 3)));

//            Add its action listener.
            tb.addActionListener(e -> {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                    SwingUtilities.updateComponentTreeUI(frame);
                    frame.pack();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
        }

        panel.add(vBox);
        return panel;
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}