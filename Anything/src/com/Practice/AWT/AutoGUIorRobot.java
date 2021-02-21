package com.Practice.AWT;

/*
 * JavaFX also has similar class named Robot.
 * In python, "pyautogui" is the similar class.
 * I post a question in stackoverflow to know is there any similar class in java as python has "pyautogui".
 * Control mouse and keyboard events by code.
 * Generates native system input events.
 */

import java.awt.*;

public class AutoGUIorRobot
{
    public static void main(String[] args) throws AWTException
    {
        Robot robot = new Robot();
        robot.mouseMove(519, 747);
    }

    private static Point getCurrentLocationOfMouse()
    {
        int x, y;
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        x = (int) pointerInfo.getLocation().getX();
        y = (int) pointerInfo.getLocation().getY();

        return new Point(x, y);
    }
}