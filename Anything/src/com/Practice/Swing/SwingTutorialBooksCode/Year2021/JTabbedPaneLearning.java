/// Information about this application.
// Seems a big application.
// Picture resolutions used in application: (700 * 670)px.
// Small icon resolution: (7 * 7)pt. 6-10 pt is good enough for small icon. (1pt = 1.3333px), (1px = 0.75pt)


package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;

/*
 * JTabbedPane class for share space.
 * To gather similar functionality, use card layout.
 * A single tabbed pane can hold many tabs as we want. To add tab, use addTab() method.
 */

/* ToDo:
    1. Add icon to all tab, G for gender. P for pet, FC for factorial calculator.
    2. Set tooltip at tabs.
*/

public class JTabbedPaneLearning
{
    public static JFrame frame = new JFrame("A BIG Application");

    public static void main(String[] args)
    {
//        Panels to add.
        JPanel genderShowingPanel = genderShowingPanel();
        JPanel petShowingPanel = petShowingPanel();
        JPanel factorialCalculator = factorialCalculator();

//        A lafChanger panel, positioned west of content pane.
        JPanel lafChanger = lafChanger();

//        Icon Creation.
        String path = "C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\Swing" +
                "\\SwingTutorialBooksCode\\Year2021\\JTabbedPaneLearning" + " Picture\\";
        Icon G = new ImageIcon(path + "G.jpg");
        Icon P = new ImageIcon(path + "P.jpg");
        Icon FC = new ImageIcon(path + "FC.jpg");

//        A tabbed pane: Creating, adding tabs and formatting.
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Gender", G, genderShowingPanel, "Alt+1");
        tabbedPane.addTab("Pet", P, petShowingPanel, "Alt+2");
        tabbedPane.addTab("Factorial Calculator", FC, factorialCalculator, "Alt+3");
        tabbedPane.setSelectedIndex(0);
        tabbedPane.setVisible(true);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        tabbedPane.setTabPlacement(SwingConstants.TOP);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(lafChanger, BorderLayout.WEST);
        contentPane.add(tabbedPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static JPanel genderShowingPanel()
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

//        A label for show gender image icon.
        JLabel showGenderPerson = new JLabel();

//        Picture paths for image icon.
        String path = "C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\Swing" +
                "\\SwingTutorialBooksCode\\Year2021\\JTabbedPaneLearning" + " Picture\\";
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

//        genderShowingPanel construction.
        JPanel genderShowingPanel = new JPanel();
//        I think problem will occur due to huge dimension.
        genderShowingPanel.setPreferredSize(new Dimension(700, 670));
        genderShowingPanel.setBackground(Color.WHITE);
        genderShowingPanel.add(showGenderPerson);

//        Preparing panel to return.
        JPanel retPanel = new JPanel(new FlowLayout());
        retPanel.add(vBox);
        retPanel.add(genderShowingPanel);

        return retPanel;
    }

    private static JPanel petShowingPanel()
    {
        JLabel showPet = new JLabel();
        String path = "C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\OracleTutorial" +
                "\\Swing\\JComboBoxLearning Pictures for Icon\\";

        Icon[] petIcon = new ImageIcon[] {new ImageIcon(path + "Bird.jpeg"), new ImageIcon(path + "Cat.jpeg"),
                new ImageIcon(path + "Dog.jpeg"), new ImageIcon(path + "Rabbit.jpeg"),
                new ImageIcon(path + "White " + "Tiger.jpeg")};

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

        JPanel retPanel = new JPanel();
        retPanel.add(vBox);

        return retPanel;
    }

    private static JPanel factorialCalculator()
    {
        JPanel retPanel = new JPanel();
        retPanel.setBackground(Color.white);

        return retPanel;
    }

    private static JPanel lafChanger()
    {
//        Get all laf installed in this system.
        UIManager.LookAndFeelInfo[] lafINFOs = UIManager.getInstalledLookAndFeels();

        ButtonGroup lafRadioButtonGroup = new ButtonGroup();
        Box vBox = Box.createVerticalBox();

        for (UIManager.LookAndFeelInfo laf : lafINFOs)
        {
            JRadioButton demoRadioButton = new JRadioButton(laf.getName());
            demoRadioButton.addActionListener(e -> {
                if (UIManager.getLookAndFeel().getName().equals(laf.getName()))
                    demoRadioButton.setSelected(true);
                try
                {
                    UIManager.setLookAndFeel(laf.getClassName());
                    SwingUtilities.updateComponentTreeUI(frame);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            });
            lafRadioButtonGroup.add(demoRadioButton);
            vBox.add(demoRadioButton);
        }

//        Preparing panel to return (retPanel).
        JPanel retPanel = new JPanel();

//        Border creating and formatting for retPanel.
        Border border = BorderFactory.createLineBorder(Color.cyan);
        retPanel.setBorder(border);

//        Adding component to retPanel.
        retPanel.add(vBox);

        return retPanel;
    }
}
