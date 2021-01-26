package com.Practice.OracleTutorial.Swing;

import javax.swing.*;
import java.awt.*;

/*
 * Editable and Uneditable combo boxes are so different.
 */

// Here is a combo box demo for pets.
public class JComboBoxLearning
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JLabel showPet = new JLabel();
        String petPicturePath = "C:\\Users\\Hp\\Documents\\Java " + "Projects\\Anything\\src\\com\\Practice" +
                "\\OracleTutorial" + "\\Swing\\JComboBoxLearning Pictures for " + "Icon\\";

        Icon[] petIcon = new ImageIcon[] {new ImageIcon(petPicturePath + "Bird.jpeg"),
                new ImageIcon(petPicturePath + "Cat.jpeg"), new ImageIcon(petPicturePath + "Dog.jpeg"),
                new ImageIcon(petPicturePath + "Rabbit.jpeg"), new ImageIcon(petPicturePath + "White Tiger.jpeg")};

        showPet.setIcon(petIcon[1]);

//        Constructing combo box.
        String[] petString = new String[] {"Bird", "Cat", "Dog", "Rabbit", "White Tiger"};
        JComboBox<String> petComboBox = new JComboBox<>(petString);
        petComboBox.setEditable(false);
        petComboBox.setSelectedIndex(1);
        petComboBox.addActionListener(e -> showPet.setIcon(petIcon[petComboBox.getSelectedIndex()]));

        JPanel showPetPanel = new JPanel();
        showPetPanel.setPreferredSize(new Dimension(783, 391));
        showPetPanel.add(showPet);

        Box vBox = Box.createVerticalBox();
        vBox.add(petComboBox);
        vBox.add(showPetPanel);

        contentPane.add(vBox);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

/*
 -> Combo boxes also fires item events when any of the items is selected or deselected. Means when item state
    changed.
 -> Only one item can be selected in a combo box, so when the user makes a new selection the previous item becomes
    deselected and fires an item event. At the same time, selected item also fires another item event.
 -> If the user reselect the selected item, no item event will fired.
 -> Combo box is a compound component, so we should listen only high-level events.
 */