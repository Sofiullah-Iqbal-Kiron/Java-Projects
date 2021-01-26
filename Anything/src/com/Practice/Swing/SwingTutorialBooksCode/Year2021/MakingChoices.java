// Set al gender pictures dimension as male picture dimension.


package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

import javax.swing.*;
import java.awt.*;

// JRadioButton (Gender Showing App)
public class MakingChoices
{
    public static void main(String[] args)
    {
//        Creating three radioButtons.
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

//        Create them mutually exclusive buttons by ButtonGroup and male is pre-selected.
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        male.setSelected(true);

        JLabel showGenderPerson = new JLabel();
        String path = "C:\\Users\\Hp\\Documents\\Java " + "Projects\\Anything\\src\\com\\Practice\\Swing" +
                "\\SwingTutorialBooksCode\\Year2021\\MakingChoices " + "Pictures for Icon\\";
        Icon malePicture = new ImageIcon(path + "Male.jpg");
        Icon femalePicture = new ImageIcon(path + "Female.jpg");
        Icon otherPicture = new ImageIcon(path + "Other.jpg");
        showGenderPerson.setIcon(malePicture);

//        Adding ActionListeners to radio buttons.
        male.addActionListener(e -> showGenderPerson.setIcon(malePicture));
        female.addActionListener(e -> showGenderPerson.setIcon(femalePicture));
        other.addActionListener(e -> showGenderPerson.setIcon(otherPicture));

//        Box is a container with BoxLayout as default LayoutManager.
        Box vBox = Box.createVerticalBox();
        vBox.add(male);
        vBox.add(female);
        vBox.add(other);

        JPanel genderShowingPanel = new JPanel();
        genderShowingPanel.setPreferredSize(new Dimension(700, 670));
        genderShowingPanel.setBackground(Color.BLACK);
        genderShowingPanel.add(showGenderPerson);

        JFrame frame = new JFrame("Gender Showing App");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(Color.BLACK);
        contentPane.add(vBox);
        contentPane.add(genderShowingPanel);

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
        JFrame frame = new JFrame("Pet Illustration with JComboBox");

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

// JToggleBox
class MakingChoicesThree
{
    public static void main(String[] args)
    {

    }
}