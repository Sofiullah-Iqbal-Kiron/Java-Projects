// Over (7 Dec, 2020. 12:39 AM)

// Press (Ctrl + Y) to delete full line in current caret.

package com.RA.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.math.BigInteger;

public class FactorialCalculator
{
    private static JLabel number = new JLabel("Number: "), Ans = new JLabel(""), factorial =
            new JLabel("Nothing to " + "show"), thanksLabel = new JLabel("");

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculate Factorial");
        JTextField textField = new JTextField(10);

        Container contentPane = frame.getContentPane();

        JButton CloseApp = new JButton("Close App");
        JButton enter = new JButton("Enter");
        enter.setBackground(Color.gray);
        enter.addActionListener(e -> {
            contentPane.remove(CloseApp);
            try
            {
                if (textField.getText().equals(""))
                {
                    enter.setBackground(Color.red);
                    Ans.setText("");
                    factorial.setText("");
                    thanksLabel.setText("Please Enter A Number");
                }
                else
                {
                    enter.setBackground(Color.green);
                    Ans.setText("Factorial of " + Integer.parseInt(textField.getText()) + '\u0020' + '\u003A' + " ");
                    factorial.setText(fact(Integer.parseInt(textField.getText())));
                    thanksLabel.setText("Thanks for using our Application");
                }
            }
            catch (NumberFormatException numberFormatException)
            {
                enter.setBackground(Color.yellow);
                Ans.setText("");
                factorial.setText("");
                thanksLabel.setText("Invalid Input");
            }

            CloseApp.addActionListener(E -> {System.exit(0);});
            contentPane.add(CloseApp);
        });

        contentPane.add(number);
        contentPane.add(textField);
        contentPane.add(enter);
        contentPane.add(Ans);
        contentPane.add(factorial);
        contentPane.add(thanksLabel);
        contentPane.setLayout(new FlowLayout());

        frame.setBackground(Color.green);
        frame.setSize(new Dimension(300, 180));
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static String fact(int number)
    {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= number; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact.toString();
    }
}

class FactorialCalculator2
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

    public static JPanel buildCenterPanel()
    {
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(centerPanelBorder());

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
        Border retBorder = BorderFactory.createLineBorder(Color.red, 2, true);

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