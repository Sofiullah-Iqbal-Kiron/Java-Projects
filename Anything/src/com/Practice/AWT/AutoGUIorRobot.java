package com.Practice.AWT;

/*
 * JavaFX also has similar class named Robot.
 * In python, "pyautogui" is the similar class.
 * I post a question in stackoverflow to know is there any similar class in java as python has "pyautogui".
 * Control mouse and keyboard events by code.
 * Generates native system input events.
 */

/*
 * public class Robot extends Object.
 * void delay(int ms) : Sleeps for the specified mili-seconds
 * public void mouseMove(int x, int y) : Moves the mouse cursor/pointer at (x, y) coordinate
 * public void mousePress(int buttons) :
 */

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AutoGUIorRobot {
    //    justClick(single ok click button) usually left button of mouse. It can be changed from OS settings.
    public static final int justClick = InputEvent.BUTTON1_DOWN_MASK;

    //    optionClick show options for current state. Usually right button of the mouse. Bug here.
    public static final int optionClick = InputEvent.BUTTON2_DOWN_MASK;

    public static void main(String[] args) throws AWTException {
        Point msEdgePoint = new Point(380, 20);
        Robot robot = new Robot();
//        robot.mouseMove(msEdgePoint.x, msEdgePoint.y);
//        robot.mousePress(justClick);
//        robot.mouseRelease(justClick);
//        robot.delay(1000);
//        robot.mousePress(justClick);
//        robot.mouseRelease(justClick);
        typeWrite(robot, "Sofiul.k.1023@gmail.coM");
    }

    private static Point getCurrentPointOfMouse() {
//        int x, y;
//        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
//        x = (int) pointerInfo.getLocation().getX();
//        y = (int) pointerInfo.getLocation().getY();
//
//        return new Point(x, y);
//        or instead

        return MouseInfo.getPointerInfo().getLocation();
    }

    public static void typeWrite(Robot r, String s) {
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    r.keyPress(65);
                    continue;
                case 'b':
                    r.keyPress(66);
                    continue;
                case 'c':
                    r.keyPress(67);
                    continue;
                case 'd':
                    r.keyPress(68);
                    continue;
                case 'e':
                    r.keyPress(69);
                    continue;
                case 'f':
                    r.keyPress(70);
                    continue;
                case 'g':
                    r.keyPress(71);
                    continue;
                case 'h':
                    r.keyPress(72);
                    continue;
                case 'i':
                    r.keyPress(73);
                    continue;
                case 'j':
                    r.keyPress(74);
                    continue;
                case 'k':
                    r.keyPress(75);
                    continue;
                case 'l':
                    r.keyPress(76);
                    continue;
                case 'm':
                    r.keyPress(77);
                    continue;
                case 'n':
                    r.keyPress(78);
                    continue;
                case 'o':
                    r.keyPress(79);
                    continue;
                case 'p':
                    r.keyPress(80);
                    continue;
                case 'q':
                    r.keyPress(81);
                    continue;
                case 'r':
                    r.keyPress(82);
                    continue;
                case 's':
                    r.keyPress(83);
                    continue;
                case 't':
                    r.keyPress(84);
                    continue;
                case 'u':
                    r.keyPress(85);
                    continue;
                case 'v':
                    r.keyPress(86);
                    continue;
                case 'w':
                    r.keyPress(87);
                    continue;
                case 'x':
                    r.keyPress(88);
                    continue;
                case 'y':
                    r.keyPress(89);
                    continue;
                case 'z':
                    r.keyPress(90);
                    continue;
                case 'A':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(65);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'B':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(66);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'C':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(67);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'D':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(68);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'E':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(69);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'F':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(70);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'G':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(71);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'H':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(72);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'I':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(73);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'J':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(74);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'K':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(75);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'L':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(76);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'M':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(77);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'N':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(78);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'O':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(79);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'P':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(80);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'Q':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(81);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'R':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(82);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'S':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(83);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'T':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(84);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'U':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(85);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'V':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(86);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'W':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(87);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'X':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(88);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'Y':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(89);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case 'Z':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(90);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '0':
                    r.keyPress(48);
                    continue;
                case '1':
                    r.keyPress(49);
                    continue;
                case '2':
                    r.keyPress(50);
                    continue;
                case '3':
                    r.keyPress(51);
                    continue;
                case '4':
                    r.keyPress(52);
                    continue;
                case '5':
                    r.keyPress(53);
                    continue;
                case '6':
                    r.keyPress(54);
                    continue;
                case '7':
                    r.keyPress(55);
                    continue;
                case '8':
                    r.keyPress(56);
                    continue;
                case '9':
                    r.keyPress(57);
                    continue;
                case ' ':
                    r.keyPress(32);
                    continue;
                case '`':
                    r.keyPress(192);
                    continue;
                case '-':
                    r.keyPress(45);
                    continue;
                case '=':
                    r.keyPress(61);
                    continue;
                case '[':
                    r.keyPress(91);
                    continue;
                case ']':
                    r.keyPress(93);
                    continue;
                case '\\':
                    r.keyPress(92);
                    continue;
                case ';':
                    r.keyPress(59);
                    continue;
                case '\'':
                    r.keyPress(222);
                    continue;
                case ',':
                    r.keyPress(44);
                    continue;
                case '.':
                    r.keyPress(46);
                    continue;
                case '/':
                    r.keyPress(47);
                    continue;
                case '~':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(192);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '!':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(49);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '@':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(50);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '#':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(51);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '$':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(52);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '%':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(53);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '^':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(54);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '&':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(55);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '*':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(56);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '(':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(57);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case ')':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(48);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '_':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(45);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '+':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(61);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '{':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(91);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '}':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(93);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '|':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(92);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case ':':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(59);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '"':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(222);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '<':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(44);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '>':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(46);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
                case '?':
                    r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyPress(47);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    continue;
            }
        }
    }
}