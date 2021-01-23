package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

import javax.swing.*;
import java.awt.*;

// JRadioButton
public class MakingChoices
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        GridLayout gridLayout = new GridLayout();

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

//        Creating three radioButtons whose are mutually exclusive.
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

//        Create mutually exclusive buttons by ButtonGroup.
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

//        A container with BoxLayout as default LayoutManager.
        Box vBox = Box.createVerticalBox();
        vBox.add(male);
        vBox.add(female);
        vBox.add(other);

        contentPane.add(vBox, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

// JComboBox<E>
// Uneditable.

/*
 * A component that combines a button or editable field and a drop-down list. The user can select a value from the list.
 */
class MakingChoicesTwo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JComboBox<String> frameWorksInJava = new JComboBox<>(new String[] {"Spring Boot", "JMonkeyEngine", "Swing",
                "JavaFX", "AWT"});
        JLabel showSelectedFrameWork = new JLabel("Nothing to Show");

//        Setting up frameWorksInJava.
        frameWorksInJava.setEditable(false);
        frameWorksInJava.addActionListener(e -> {
            showSelectedFrameWork.setText(frameWorksInJava.getItemAt(frameWorksInJava.getSelectedIndex()) + " is " +
                    "selected.");
            frame.pack();
        });


        Box vBox = new Box(BoxLayout.Y_AXIS); // Box.createVerticalBox()
        vBox.add(frameWorksInJava);
        vBox.add(showSelectedFrameWork);

        contentPane.add(vBox, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}