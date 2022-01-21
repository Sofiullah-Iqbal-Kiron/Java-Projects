/*
 * JComboBox is a dropdown choice list.
 * Lets the user choose one of several choices.
 * Test by changing background or foreground colors.
 */

package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class JComboBoxClass {
    private static JFrame frame = new JFrame("JComboBox Demonstration");
    private static Container contentPane = frame.getContentPane();

    private static String[] namesForButtons = {"Kiron", "Musabbir", "Saiful Islam", "Kopal Amar", "Kazi Iqbal"};

    private static JPanel comboBoxPanel = createComboBoxPanel(); // comboBoxPanel
    private static JPanel buttonsPanel = createButtonsPanel();


    private static JPanel createComboBoxPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String[] aligns = {"Left", "Center", "Right"};
        JComboBox comboBox = new JComboBox(aligns);
        comboBox.setSelectedIndex(1); // "Center" selected by default. If we don't specify selected index, index 0 will be assumed as selected.

        //        ActionListener for comboBox.
        comboBox.addActionListener(e -> {
            Component[] buttons = buttonsPanel.getComponents();

            String alignment = (String) comboBox.getSelectedItem();
            switch(alignment) {
                case "Left":
                    for(Component b : buttons)
                        if(b instanceof JButton) ((JButton) b).setAlignmentX(Component.LEFT_ALIGNMENT);
                    buttonsPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
                    break;
                case "Center":
                    for(Component b : buttons)
                        if(b instanceof JButton) ((JButton) b).setAlignmentX(Component.CENTER_ALIGNMENT);
                    buttonsPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
                    break;
                case "Right":
                    for(Component b : buttons)
                        if(b instanceof JButton) ((JButton) b).setAlignmentX(Component.RIGHT_ALIGNMENT);
                    buttonsPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
                    break;
            }

            SwingUtilities.updateComponentTreeUI(frame);
            frame.pack();
        });

        //        Adding components to the panel.
        panel.add(comboBox);

        return panel;
    }

    private static JPanel createButtonsPanel() {
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBackground(Color.LIGHT_GRAY);
        int height = comboBoxPanel.getHeight() + 20;
        int width = comboBoxPanel.getWidth() + 20;
        panel.setSize(height, width);

        for(int i = 0; i < namesForButtons.length; i++) {
            JButton b = new JButton(namesForButtons[i]);
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(b);
        }

        return panel;
    }

    public static void main(String[] args) {
        BoxLayout boxLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(boxLayout);
        contentPane.add(comboBoxPanel);
        contentPane.add(buttonsPanel);

        frameSetting();
    }

    private static void frameSetting() {
        try {
            UIManager.LookAndFeelInfo[] lafi = UIManager.getInstalledLookAndFeels();
            for(UIManager.LookAndFeelInfo l : lafi) {
                if(l.getName().equals("Nimbus")) {
                    UIManager.setLookAndFeel(l.getClassName());
                    SwingUtilities.updateComponentTreeUI(frame);
                }
            }
        } catch(UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}
