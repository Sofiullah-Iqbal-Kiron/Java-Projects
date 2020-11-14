package com.Practice.AWT;

import java.awt.*;

public class CheckBox
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Language Checking");
        String inLabel = "Can you see?";
        Label l = new Label(inLabel);
        f.setLayout(new FlowLayout());
        f.setSize(600, 600);
        f.setVisible(true);
        f.add(l);
        Checkbox c1 = new Checkbox("Java"), c2 = new Checkbox("Python"), c3 = new Checkbox("C#");
        f.add(c1);
        f.add(c2);
        f.add(c3);
    }
}
