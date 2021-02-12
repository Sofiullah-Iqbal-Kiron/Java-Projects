package com.Practice.OracleTutorial.Swing;

import javax.swing.*;
import java.awt.*;

/* JPasswordField
 * Is one kind of text field so it hold all kind of text field methods.
 * For the security reason, the field does not show the actual characters that user typed. Asterisk or dot will be
 * shown instead of this.
 * And the every character stored on a char array rather than a string.
 * Fires action event when text entry completed or enter button is pressed.
 */

public class JPasswordFieldLearning
{
    private static JFrame frame = new JFrame("Password");
    public static final char BULLET = '\u2022';

    public static void main(String[] args)
    {
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

        JPasswordField password = new JPasswordField();
        password.setEchoChar(BULLET);

        Container contentPane = frame.getContentPane();
        contentPane.add(password);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
