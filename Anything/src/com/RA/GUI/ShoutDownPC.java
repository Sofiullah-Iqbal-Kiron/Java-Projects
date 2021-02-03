package com.RA.GUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ShoutDownPC
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Shutter Down");

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

//        introducingLabel.
        JPanel introducingLabelHolder = new JPanel();
        introducingLabelHolder.setPreferredSize(new Dimension(200, 45));
        introducingLabelHolder.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.white));
        introducingLabelHolder.add(new JLabel("PC Shout Down GUI"));

        JButton powerOff = new JButton("POWER OFF");
        powerOff.addActionListener(e -> {
            /*try
            {
                Runtime.getRuntime().exec("shutdown -s -t 1000");
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }*/
        });
        JPanel powerOffHolder = new JPanel();
        powerOffHolder.add(powerOff);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(introducingLabelHolder,BorderLayout.NORTH);
        contentPane.add(powerOffHolder);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
