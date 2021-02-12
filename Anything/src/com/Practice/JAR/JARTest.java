// package com.Practice.JAR;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JARTest
{
    private static JFrame frame = new JFrame("Path Fixer");
    private static JPanel introducingLabelHolder = new JPanel();
    private static JLabel introducingLabel = new JLabel("A Path Fixer for Windows OS");
    private static JPanel southSideButtonHolder = new JPanel(new FlowLayout());
    private static JPanel inputLabelHolder = new JPanel();
    private static JPanel outputLabelHolder = new JPanel();

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(frame);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        introducingLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        introducingLabelHolder.setPreferredSize(new Dimension(0, 64));
        introducingLabelHolder.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        introducingLabelHolder.add(introducingLabel);

        JLabel inputLabel = new JLabel("Your Path: ");
        inputLabel.setFont(new Font(Font.DIALOG, Font.CENTER_BASELINE, 11));
        JLabel outputLabel = new JLabel("Fixed Path: ");
        outputLabel.setFont(new Font(Font.DIALOG, Font.CENTER_BASELINE, 11));
        JTextField inputTextField = new JTextField(30), outputTextField = new JTextField(30);
        outputTextField.setEditable(false);
        inputTextField.addActionListener(e -> outputTextField.setText(fixedPath(inputTextField.getText())));

        inputLabelHolder.setPreferredSize(new Dimension(70, 39));
        inputLabelHolder.setLayout(new BorderLayout());
        inputLabelHolder.setBackground(Color.lightGray);
        inputLabelHolder.add(inputLabel, BorderLayout.EAST);

        outputLabelHolder.setPreferredSize(new Dimension(70, 39));
        outputLabelHolder.setLayout(new BorderLayout());
        outputLabelHolder.setBackground(Color.lightGray);
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

        JButton close = new JButton("Close"), reset = new JButton("Reset");
        close.addActionListener(e -> System.exit(0));
        reset.addActionListener(e -> {
            inputTextField.setText("");
            outputTextField.setText("");
        });
        southSideButtonHolder.add(reset);
        southSideButtonHolder.add(close);

        JPanel westThemePanel = westThemePanel();

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(introducingLabelHolder, BorderLayout.NORTH);
        contentPane.add(vBox, BorderLayout.CENTER);
        contentPane.add(southSideButtonHolder, BorderLayout.SOUTH);
        contentPane.add(westThemePanel, BorderLayout.WEST);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static JPanel westThemePanel()
    {
        JPanel panel = new JPanel();

        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2), "Theme");
        panel.setBorder(border);

        Color defaultTextColor = introducingLabel.getForeground();
        Color defaultHolderColor = introducingLabelHolder.getBackground();
        Color defaultSouthSideButtonHolderBackground = southSideButtonHolder.getBackground();
        Border defaultBorder = introducingLabelHolder.getBorder();
        JRadioButton defaultTheme = new JRadioButton("Default");
        defaultTheme.setSelected(true);
        defaultTheme.addActionListener(e -> {
            introducingLabel.setForeground(defaultTextColor);
            introducingLabelHolder.setBackground(defaultHolderColor);
            introducingLabelHolder.setBorder(defaultBorder);
            panel.setBackground(Color.white);
            panel.setBorder(border);
            southSideButtonHolder.setBackground(defaultSouthSideButtonHolderBackground);
        });

        JRadioButton darkTheme = new JRadioButton("Dark");
        darkTheme.addActionListener(e -> {
            introducingLabel.setForeground(Color.lightGray);
            introducingLabelHolder.setBackground(Color.darkGray);
            panel.setBackground(Color.lightGray);
            southSideButtonHolder.setBackground(Color.darkGray);
            outputLabelHolder.setBackground(Color.lightGray);
            panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.darkGray, 2),
                    "Theme"));
        });

        ButtonGroup westThemePanelButtonGroup = new ButtonGroup();
        westThemePanelButtonGroup.add(defaultTheme);
        westThemePanelButtonGroup.add(darkTheme);

        Box westThemePanelBox = Box.createVerticalBox();
        westThemePanelBox.add(defaultTheme);
        westThemePanelBox.add(darkTheme);

        panel.setBackground(Color.white);
        panel.add(westThemePanelBox);

        return panel;
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
