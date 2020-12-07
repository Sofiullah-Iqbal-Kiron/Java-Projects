package com.RA;

import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static final Scanner input = new Scanner(System.in);
    public static void newLine() {System.out.println();}

    /*public static void main(String[] args)
    {
        int i;
        int n = input.nextInt();
        for (i = 1; i <= n; i++)
        {
            System.out.println("হাউ মাউ খাও পেট বাছাও");
        }
    }*/

    //    Required by Solaiman Hossain ShanTo (Camel case naming convention).
    public static void main(String[] args)
    {
//        Declaration
        ArrayList<Point> list = new ArrayList<>();

//        Adding elements.
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));

//        To access members.
        for (Point p : list)
            System.out.print(p + " ");

        newLine();

//        Else
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).x + " " + list.get(i).y);
    }
}
