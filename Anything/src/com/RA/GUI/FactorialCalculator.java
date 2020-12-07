// Over (7 Dec, 2020. 12:39 AM)


package com.RA.GUI;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class FactorialCalculator
{
    private static JLabel number = new JLabel("Number:-"), Ans = new JLabel("Factorial:-"), factorial = new JLabel(
            "Nothing to show");

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculate Factorial");
        JTextField textField = new JTextField(10);

        Container contentPane = frame.getContentPane();

        JButton done = new JButton("Enter");
        done.setBackground(Color.gray);
        done.addActionListener(e -> {
            if (textField.getText().equals(""))
            {
                done.setBackground(Color.red);
                contentPane.remove(Ans);
                factorial.setText("Invalid Input");
            }
            else
            {
                done.setBackground(Color.green);
                Ans.setText("Factorial of " + Integer.parseInt(textField.getText()) + '\u0020' + '\u003A' + " ");
                factorial.setText(fact(Integer.parseInt(textField.getText())));
                contentPane.add(new JLabel("Thanks for using our Application"));
            }

            JButton CloseApp = new JButton("Close App");
            CloseApp.addActionListener(E -> {System.exit(0);});
            contentPane.add(CloseApp);
        });

        contentPane.add(number);
        contentPane.add(textField);
        contentPane.add(done);
        contentPane.add(Ans);
        contentPane.add(factorial);
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
