package com.Practice.AWT;

/*
 * Provides methods for getting information about the mouse.
 * int getNumberOfButtons();
 * PointerInfo getPointerInfo();
 */

import java.awt.*;

public class MouseInfoClass
{
    public static void main(String[] args)
    {
        System.out.println(MouseInfo.getNumberOfButtons());
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        System.out.println(pointerInfo.getLocation().getX());
        System.out.println(pointerInfo.getLocation().getY());
    }
}
