// JOptionPane class directly instantiate and display dialogs.
// Used for create simply standard dialogs.
// The ProgressMonitor class can put up a dialog that shows the progress of an operation.
// To create a custom dialog, use JDialog directly.


package com.Practice.Swing.Year2022;

import javax.swing.*;

public class JOptionPaneClass {
    public static void main(String[] args) {
        warnMe();
    }

    private static void showMessageDialog() {
        JOptionPane.showMessageDialog(null, "Eggs are not supposed to be green.", "Message", JOptionPane.PLAIN_MESSAGE);
    }

    private static void warnMe() {
        JOptionPane.showMessageDialog(null, "Study Hard, Kiron.\nEither you fail.", "Hey!",
                JOptionPane.WARNING_MESSAGE);
    }
}