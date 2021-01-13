// Over (7 Dec, 2020. 12:39 AM)

// Press (Ctrl + Y) to delete full line in current caret.


package com.RA.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.math.BigInteger;

class FactorialCalculator
{
    //    Fields
    public static JFrame mainFrame = new JFrame("Calculate Your Factorial");
    public static JPanel topPanel = buildTopPanel();
    public static JPanel leftPanel = buildLeftPanel();
    public static JPanel centerPanel = buildCenterPanel();

    public static void main(String[] args)
    {
        Container contentPane = mainFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(topPanel, BorderLayout.NORTH);
        contentPane.add(leftPanel, BorderLayout.WEST);
        contentPane.add(centerPanel, BorderLayout.CENTER);

        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static JPanel buildTopPanel()
    {
        JPanel topPanel = new JPanel();
        topPanel.setBorder(topPanelBorder());
        topPanel.setLayout(topPanelLayout());

        JLabel aLabel = new JLabel("Simple Factorial Calculator");

        topPanel.add(aLabel, BorderLayout.CENTER);
        topPanel.setForeground(Color.gray);

        return topPanel;
    }

    public static JPanel buildLeftPanel()
    {
        JPanel leftPanel = new JPanel();

        return leftPanel;
    }

    private static JPanel buildCenterPanel()
    {
//        Declaration.
        JPanel centerPanel = new JPanel();

        JLabel enterMessageLabel = new JLabel("Enter Your number: ");
        JTextField enterTextField = new JTextField(10);
        JLabel ansLabel = new JLabel("Welcome, Nothing To Show");
        JButton enterButton = new JButton("Enter");
        JButton closeButton = new JButton("Close");
        enterButton.setMnemonic('E');

//        Adding Listeners.
        enterButton.addActionListener(e -> {
            try
            {
                if (enterTextField.getText().equals(""))
                {
                    enterButton.setBackground(Color.red);
                    ansLabel.setText("Empty! Enter A Valid Number");
                }
                else
                {
                    enterButton.setBackground(Color.green);
                    ansLabel.setText("Factorial of " + Integer.parseInt(enterTextField.getText()) + ": " + factorialAns(Integer.parseInt(enterTextField.getText())));
                }
            }
            catch (NumberFormatException numberFormatException)
            {
                enterButton.setBackground(Color.red);
                ansLabel.setText("Invalid Input. Enter A Valid Integer");
            }
        });

        closeButton.addActionListener(e -> System.exit(0));

//        Set GridLayout for centerPanel.
        GridLayout layoutForCenterPanel = new GridLayout(3, 0);

//        First Panel/component to be added to the centerPanel.
        JPanel firstPanelOfCenterPanel = new JPanel();
        firstPanelOfCenterPanel.setLayout(new FlowLayout());
        firstPanelOfCenterPanel.add(enterMessageLabel);
        firstPanelOfCenterPanel.add(enterTextField);

//        Modifying center panel.
        centerPanel.setBorder(centerPanelBorder());
        centerPanel.setLayout(layoutForCenterPanel);

//        Adding components at centerPanel.
        centerPanel.add(firstPanelOfCenterPanel);
        centerPanel.add(enterButton);
        centerPanel.add(ansLabel);
        centerPanel.add(closeButton);

        return centerPanel;
    }

    public static Border topPanelBorder()
    {
        Border retBorder = BorderFactory.createLineBorder(Color.red, 2, true);

        return retBorder;
    }

    public static Border leftPanelBorder()
    {
        Border retBorder = BorderFactory.createLineBorder(Color.red, 2, true);

        return retBorder;
    }

    public static Border centerPanelBorder()
    {
        Border retBorder = BorderFactory.createLineBorder(Color.green, 2, false);

        return retBorder;
    }

    public static LayoutManager topPanelLayout()
    {
        BorderLayout retLayout = new BorderLayout(20, 0);

        return retLayout;
    }

    private static String factorialAns(int number)
    {
        BigInteger factorialAns = new BigInteger("1");
        for (int i = 2; i <= number; i++)
            factorialAns = factorialAns.multiply(BigInteger.valueOf(i));

        return factorialAns.toString();
    }
}