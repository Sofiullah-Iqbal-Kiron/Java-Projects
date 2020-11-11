package com.Practice.AWT;

import java.awt.*;

// Here we will define our own functionality and Layouts. All for Second.java class.
public class MyFrame extends Frame
{
    Label label;
    TextField textField;
    Button button;

    public MyFrame()
    {
        super("My App");

        setLayout(new FlowLayout());

        label = new Label("Label:");
        textField = new TextField(20);
        button = new Button("Okay?");

        add(label);
        add(textField);
        add(button);
    }
}
