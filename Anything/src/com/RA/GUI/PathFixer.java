package com.RA.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/*
 * text field takes enter button as action listener. Anything else?
 * Try to give position at the beginning of the code.
 */

public class PathFixer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Path Fixer");

//        LookAndFeel.
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(frame);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

//        introducingLabel.
        JPanel introducingLabelHolder = new JPanel();
        introducingLabelHolder.setPreferredSize(new Dimension(0, 60));
        Border introducingLabelHolderBorder =
                BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 3), "");
        introducingLabelHolder.setBorder(introducingLabelHolderBorder);
        introducingLabelHolder.add(new JLabel("A Path Fixer for Windows OS"));

        JLabel inputLabel = new JLabel("Your Path: ");
        JLabel outputLabel = new JLabel("Fixed Path: ");
        JTextField inputTextField = new JTextField(30), outputTextField = new JTextField(30);
        outputTextField.setEditable(false);
        inputTextField.addActionListener(e -> outputTextField.setText(fixedPath(inputTextField.getText())));

        JPanel inputLabelHolder = new JPanel();
        inputLabelHolder.setPreferredSize(new Dimension(70, 39));
        inputLabelHolder.setLayout(new BorderLayout());
        inputLabelHolder.setBackground(Color.lightGray);
        inputLabelHolder.add(inputLabel, BorderLayout.EAST);

        JPanel outputLabelHolder = new JPanel();
        outputLabelHolder.setPreferredSize(new Dimension(70, 39));
        outputLabelHolder.setLayout(new BorderLayout());
        outputLabelHolder.setBackground(Color.gray);
        outputLabelHolder.add(outputLabel, BorderLayout.EAST);

        Box inputBox = Box.createHorizontalBox();
        inputBox.add(inputLabelHolder);
        inputBox.add(inputTextField);

        Box outputBox = Box.createHorizontalBox();
        outputBox.add(outputLabelHolder);
        outputBox.add(outputTextField);

        Box vBox = Box.createVerticalBox();
        vBox.add(inputBox);
        vBox.add(outputBox);

//        Preparing south side for contentPane.
        JButton close = new JButton("Close"), reset = new JButton("Reset");
        close.addActionListener(e -> System.exit(0));
        reset.addActionListener(e -> {
            inputTextField.setText("");
            outputTextField.setText("");
        });
        JPanel southSideButtonHolder = new JPanel(new FlowLayout());
        southSideButtonHolder.add(reset);
        southSideButtonHolder.add(close);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(introducingLabelHolder, BorderLayout.NORTH);
        contentPane.add(vBox, BorderLayout.CENTER);
        contentPane.add(southSideButtonHolder, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static String fixedPath(String path)
    {
        String ans = "";
        for (int i = 0; i < path.length(); i++)
        {
            if (path.charAt(i) == '\\')
                ans += '\\';
            ans += path.charAt(i);
        }

        return ans;
    }
}
