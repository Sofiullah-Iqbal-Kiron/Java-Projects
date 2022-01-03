// Returns current screen resolution in Dimension.
// Using ToolKit class.


package com.RA;

import java.awt.Dimension;
import java.awt.Toolkit;

public class CurrentScreenResolution {
    public static void main(String[] args) {
        System.out.println(getResolution());
    }

    private static Dimension getResolution() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
