package com.RA;

public class Divisibility {
    public static void main(String[] args) {
        System.out.println(divisibleBy4("3"));
    }
    public static boolean divisibleBy2(String number) {
//    A number is divisible by two if the last digit is one of them: 0, 2, 4, 6, 8
        int last = number.length() - 1;
        return number.charAt(last) == '0' || number.charAt(last) == '2' || number.charAt(last) == '4' || number.charAt(last) == '6' || number.charAt(last) == '8';
    }

    public static boolean divisibleBy3(String number) {
//        A number is divisible by 3 if sum of it's digit: digitSum is divisible by 3
//        This method can throw exception cause digitSum can be much bigger that's why primitives can not hold it
        return true;
    }

    public static boolean divisibleBy4(String number) {
//        A number is divisible by 4 if newNumber(that formed with last two digits of number) is divisible by 4
//        This method need to upgrade more
        int newNumber = 0, numLen = number.length();
        if (number.equals("0") || number.equals("4") || number.equals("8") || number.equals("-4") || number.equals(
                "-8"))
            return true;
        if (number.length() == 1) return false;
        newNumber = newNumber * 10 + number.charAt(numLen - 2) - '0';
        newNumber = newNumber * 10 + number.charAt(numLen - 1) - '0';

        return newNumber % 4 == 0;
    }
}
