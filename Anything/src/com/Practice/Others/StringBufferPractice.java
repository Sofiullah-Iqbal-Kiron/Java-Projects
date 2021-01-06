package com.Practice.Others;

public class StringBufferPractice
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer(); // Empty constructor with initial size 16.
        StringBuffer sb2 = new StringBuffer(20);
        sb1.append(1000);
        System.out.println(sb1);
        String conString = sb1.append(4.0040).toString();
        System.out.println(conString);
        System.out.println(sb1.append(sb2));
        System.out.println(sb1.insert(2, "Kiron"));
        System.out.println(sb1.append(true));
        System.out.println(sb1.capacity());
        System.out.println(sb1.compareTo(new StringBuffer("Kiron")));
        System.out.println(sb1.charAt(2));
        System.out.println(sb1.delete(2, 7));
        System.out.println(sb1.deleteCharAt(0));
        sb1.setCharAt(0, 'K');
        System.out.println(sb1);
        System.out.println(sb1.subSequence(0, 4));
        System.out.println(sb1.reverse());
    }
}
