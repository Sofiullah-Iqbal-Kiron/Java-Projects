package com.Practice.Swing.SwingTutorialBooksCode;

/*
 * JTextField:
 * Single line editable text field.
 * JTextField()
 * JTextField(String initialText)
 * JTextField(int columns)
 * JTextField(Document document, String initialText, int columns)
 */

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

public class Dec15
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        JTextField emptyTextField = new JTextField(), columnTextField = new JTextField(10), initTextField =
                new JTextField("Initial Text");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(emptyTextField);
        contentPane.add(columnTextField);
        contentPane.add(initTextField);

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MirroredTextField extends JFrame
{
    JLabel nameLabel = new JLabel("Name: ");
    JLabel mirroredNameLabel = new JLabel("Mirrored Name: ");
    JTextField name = new JTextField(10);
    JTextField mirroredName = new JTextField(10);

    public MirroredTextField()
    {
        super("Mirrored JTextField");
        this.initFrame();
    }

    private void initFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 0));
        Container contentPane = this.getContentPane();
        contentPane.add(nameLabel);
        contentPane.add(name);
        contentPane.add(mirroredNameLabel);
        contentPane.add(mirroredName);

//        Set the model for mirroredName to be the same
//        as name's model, so they share their content's storage.
        Document nameModel = name.getDocument();
        mirroredName.setDocument(nameModel);
    }

    public static void main(String[] args)
    {
        MirroredTextField frame = new MirroredTextField();
        frame.pack();
        frame.setVisible(true);
    }
}