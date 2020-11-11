// Not working properly.


package com.Practice.AWT;

import java.awt.*;

public class Three extends Frame
{
    Button button;
    Label label;
    TextField textField;

    public Three()
    {
        label = new Label("Label:");
        textField = new TextField(20);
        button = new Button("Okay?");

        add(label);
        add(textField);
        add(button);
    }

    public static void main(String[] args)
    {
        Three obj = new Three();
        obj.setSize(500, 500);
        obj.setVisible(true);
    }
}
