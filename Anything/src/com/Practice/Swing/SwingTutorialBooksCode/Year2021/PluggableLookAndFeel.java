package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

/* Look and Feel (laf, L&F, LAF):
 * Look: what kind of look like.
 * Feel: interaction with user.
 * Set look and feel for a swing application by setLookAndFeel(String fullNameWithPath) method of UIManager class.
 * Four type of laf are available:
   -> crossPlatformLookAndFeel / metal / ocen / default of JRE. To get this: String
   * getCrossPlatformLookAndFeelClassName();
   -> systemLookAndFeel, provided by Operating System. To get this: String getSystemLookAndFeelClassName();
   -> Synth: create own laf with XML. It is not easy to do so.
   -> Multiplex: Combination of multiple laf at a time.
 */

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.TreeMap;

public class PluggableLookAndFeel
{
    public static void main(String[] args)
    {

    }
}

/* javax.swing.UIManager.LookAndFeelInfo
 * a public static class provides a little information about an installed LookAndFeel for the
 * sake of configuring a menu or for initial application set up.
 */

class AllInstalledLookAndFeel /* Currently Installed or available */
{
    public static void main(String[] args)
    {
        UIManager.LookAndFeelInfo[] lafINFO = UIManager.getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo lafInfo : lafINFO)
        {
            String name = lafInfo.getName(), className = lafInfo.getClassName();
            System.out.println("Name: " + name + "    and Class Name: " + className);
        }
    }
}

/* ButtonGroup:
 * This class is used to create a multiple-exclusion scope for a set of buttons.
 * Creating a set of buttons with the same ButtonGroup object means that
 * turning "on" one of those buttons turns off all other buttons in the group.
 */

/* javax.swing.Box
 * A lightweight container class that extends JComponents.
 * Uses BoxLayout default.
 * Box class provides several class methods that are useful for containers using BoxLayout - even
 * non-box containers.
 *
 * This class can creates several kinds of invisible components that affect layout.
 * Such as: glue, struts and rigid.
 * glue: If all the components in Box contains fixed size, use glue component.
 * strut: If needs a fixed amount of space between two components, use strut.
 * rigid: If needs a invisible component that takes up the same amount of space, get this by invoking createRigidArea.
 */

class ExperimentingWithCurrentLookAndFeels
{
    //    Fields
    public static JLabel topLabel = new JLabel("Initially, nothing to show");
    public static ButtonGroup lafRadioButtonGroup = new ButtonGroup();
    public static Map<String, String> lafInstalled = new TreeMap<>();
    public static String currentLaf = UIManager.getLookAndFeel().getName();

    public static void main(String[] args)
    {
        for (UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels())
            lafInstalled.put(lafInfo.getName(), lafInfo.getClassName());

//        Constructing the frame.
        JFrame frame = new JFrame("Experimenting with All Installed Look and Feels");

//        Constructing panes for contentPane.
        JPanel topPanel = buildTopPanel();
        JPanel leftPanel = buildLeftPanel();
        JPanel rightPanel = buildRightPanel();

//        Adding panels to the contentPane.
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(topPanel, BorderLayout.NORTH);
        contentPane.add(leftPanel, BorderLayout.WEST);
        contentPane.add(rightPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static Border giveMeBorderBro(String title)
    {
        Border etched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        return BorderFactory.createTitledBorder(etched, title);
    }

    private static JPanel buildTopPanel()
    {
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(topLabel, BorderLayout.CENTER);
        topLabel.setBorder(giveMeBorderBro("Current Look and Feel"));

        return topPanel;
    }

    private static JPanel buildLeftPanel()
    {
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(giveMeBorderBro("L&F Name"));
        Box vBox = Box.createVerticalBox();

//        Add radioButton for each look and feel.
        for (String lafName : lafInstalled.keySet())
        {
            JRadioButton radioButton = new JRadioButton(lafName);
            if (lafName.equals(currentLaf))
                radioButton.setSelected(true);

            radioButton.addItemListener(e -> {});
        }

        leftPanel.add(vBox);
        return leftPanel;
    }

    private static JPanel buildRightPanel()
    {
        JPanel rightPanel = new JPanel();

        return rightPanel;
    }
}
