package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class DialogDemo {
    private static JFrame frame = new JFrame("Dialog Demo");
    private static Container contentPane = frame.getContentPane();

    private static LayoutManager layout = new BorderLayout();

    private static JPanel frequentPanel = createSimpleDialogBox(), featurePanel = createFeatureDialogBox(),
            iconPanel = createIconDialogBox();
    private static JLabel label = new JLabel("Click the \"Show It\" button to bring up the selected dialog.",
            JLabel.CENTER);

    private static String simpleDialogDesc = "Some simple message dialog.", iconDesc = "A JOptionPane has its choice "
            + "of " + "icons.", moreDialogDesc = "Some more dialogs.";

    private static JPanel createSimpleDialogBox() {
        JRadioButton[] radioButtons = new JRadioButton[4];
        final ButtonGroup group = new ButtonGroup();

        final String defaultMessageCommand = "default", yesNoCommand = "yesno", yeahNahCommand = "yeahnah",
                yncCommand = "ync";

        radioButtons[0] = new JRadioButton("OK (in the L&F's words)");
        radioButtons[0].setActionCommand(defaultMessageCommand);

        radioButtons[1] = new JRadioButton("Yes/No (in the L&F's words)");
        radioButtons[1].setActionCommand(yesNoCommand);

        radioButtons[2] = new JRadioButton("Yes/No (in the programmer's words)");
        radioButtons[2].setActionCommand(yeahNahCommand);

        radioButtons[3] = new JRadioButton("Yes/No/Cancel (in the programmer's words)");
        radioButtons[3].setActionCommand(yncCommand);

        for (JRadioButton j : radioButtons) group.add(j);
        radioButtons[0].setSelected(true);

        JButton showItButton = new JButton("Show It!");
        showItButton.addActionListener(e -> {
            String command = group.getSelection().getActionCommand();

//            Ok dialog.
            if (command == defaultMessageCommand) {
                JOptionPane.showMessageDialog(frame, "Eggs aren't supposed to be green.");
            }
            else if (command == yesNoCommand) {
                int n = JOptionPane.showConfirmDialog(frame, "Would you like green eggs than ham?", "An Inane " +
                        "Question", JOptionPane.YES_NO_OPTION);

                if (n == JOptionPane.YES_OPTION) label.setText("Ewww!");
                else if (n == JOptionPane.NO_OPTION) label.setText("Me neither!");
                else label.setText("Come on -- tell me!");
            }
            else if (command == yeahNahCommand) {
                Object[] options = {"Yes, please", "No way!"};
                int n = JOptionPane.showOptionDialog(frame, "Would you like green eggs and ham?", "A silly question",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (n == JOptionPane.YES_OPTION) label.setText("You are kidding.");
                else if (n == JOptionPane.NO_OPTION) label.setText("I don't like them either.");
                else label.setText("Come on -- 'fees up!");
            }
            else if (command == yncCommand) {
                Object[] options = {"Yes, please", "No, thanks", "No eggs, no ham!"};
                int n = JOptionPane.showOptionDialog(frame, "Would you like some green eggs to go with that ham?", "A"
                        + " Silly Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        options, options[2]);
                if (n == JOptionPane.YES_OPTION) label.setText("Here you go: green eggs and ham!");
                else if (n == JOptionPane.NO_OPTION) label.setText("OK, just the ham, then.");
                else if (n == JOptionPane.CANCEL_OPTION) label.setText("Well, I'm certainly not going to eat them!");
                else label.setText("Please tell me what you want!");
            }
        });

        return createPane(simpleDialogDesc + ": ", radioButtons, showItButton);
    }
    private static JPanel createPane(String description, JRadioButton[] radioButtons, JButton showButton) {
        Box box = Box.createVerticalBox();
        box.add(new JLabel(description));

        for (JRadioButton j : radioButtons) box.add(j);

        JPanel pane = new JPanel(new BorderLayout());
        pane.add(box, BorderLayout.PAGE_START);
        pane.add(showButton, BorderLayout.PAGE_END);

        return pane;
    }

    //    Second tabs panel.
    private static JPanel createFeatureDialogBox() {
        final int numButtons=5;
        JRadioButton[] radioButtons=new JRadioButton[numButtons];
        final ButtonGroup group=new ButtonGroup();

        JButton showItButton=null;

        final String pickOneCommand="pickone", textEnteredCommand="textfield",nonAutoCommand="nonautooption",
                customOption="customoption",nonModalCommand="nonmodal";

        radioButtons[0]=new JRadioButton("Pick one of several choices.");
        radioButtons[0].setActionCommand(pickOneCommand);

        radioButtons[1]=new JRadioButton("Enter some text: ");
        radioButtons[1].setActionCommand(textEnteredCommand);

        radioButtons[2]=new JRadioButton("Non-auto-closing dialog");
        radioButtons[2].setActionCommand(nonAutoCommand);

        radioButtons[3]=new JRadioButton("Input-validating dialog with custom message area");
        radioButtons[3].setActionCommand(customOption);

        radioButtons[4]=new JRadioButton("");

        return null;
    }
    private static JPanel createIconDialogBox() {
        return null;
    }

    public static void main(String[] args) {
        contentPaneSetting();

        frameSetting();
    }

    private static void contentPaneSetting() {
        contentPane.setLayout(layout);
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }
}
