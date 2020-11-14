package com.Practice.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionHelper extends Frame implements ActionListener
{
    int count = 0;
    Label label;
    Button button;

    String[] names = {"Kiron", "Nirob", "Miron", "Chiron", "Jiron", "Liron"};

    public ButtonActionHelper()
    {
        label = new Label("No Name");
        button = new Button("Increment");
        button.addActionListener(this);

        setLayout(new FlowLayout());
        add(button);
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText(count < names.length ? names[count] : "Over");
    }
}