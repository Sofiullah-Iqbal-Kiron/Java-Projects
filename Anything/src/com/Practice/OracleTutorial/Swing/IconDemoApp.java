// Source LinK: https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle
// .com/javase/tutorial/uiswing/examples/components/IconDemoProject/src/components/IconDemoApp.java

/*
 * JToolBar short documentation:
 * For displaying commonly used "Actions" or "Controls" onto a component with icon view.
 * User can drag out toolbar into a separate window unless the floatable property is set to false.
 * Add toolbar into a container whose layout manager is a BorderLayout.
 * Here buttonBar will used for represent picture thumbnail. (Picture Gallery)
 */


package com.Practice.OracleTutorial.Swing;

import javax.swing.*;

public class IconDemoApp extends JFrame
        /* Now we can use all of members of JFrame class in this class. This is a subclass of JFrame superclass. */
{
    private JLabel photographLabel = new JLabel();
    private JToolBar buttonBar = new JToolBar();
}
