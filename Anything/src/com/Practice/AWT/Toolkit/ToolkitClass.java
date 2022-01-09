/*
 * Toolkit class is an abstract superclass of all actual implementations of AWT.
 * To communicate with native toolkit system.
 * To get screen size, resolution, beeping.
 * HeadlessException can be thrown.
 * abstract Dimension getScreenSize() throws HeadlessException: Current screen Dimension with width and height in
 * pixels.
 * abstract Clipboard getSystemClipboard():
 */

/*
 * Task of this code:
 * Copy the selected text from a JTextArea named dateTextArea to the system clipboard.
 * If there is no text selection then beep and display warning message within a dialog.
 * Topics: JTextArea, JOptionPane, Transferable.
 */


package com.Practice.AWT.Toolkit;

import javax.swing.*;
import java.awt.*;

public class ToolkitClass {
    private static TopFrame frame = new TopFrame("Copy & Paste");
    private static Container contentPane = frame.getContentPane();

    //    Components.
    private static JTextArea dataTextArea = new JTextArea(10, 10);
    private static Toolkit toolkit = Toolkit.getDefaultToolkit();

    //    Layout for contentPane of the TopFrame.
    private static LayoutManager layout = new FlowLayout();

    //    Beep button.
    private static JButton beepButton = new JButton("<html><body><b>Beep</b> Me</body></html>");

    //    Main method.
    public static void main(String[] args) {
        beepButtonSetting();

        addComponentsToTheContentPane();

        frameSetting();
    }

    private static void beepButtonSetting() {
        beepButton.addActionListener(e -> toolkit.beep());
    }

    private static void addComponentsToTheContentPane() {
        contentPane.add(beepButton);
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}