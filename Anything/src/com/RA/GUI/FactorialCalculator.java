// Over (7 Dec, 2020. 12:39 AM)


package com.RA.GUI;

import javax.swing.*;
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