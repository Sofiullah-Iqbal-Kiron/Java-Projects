//package com.RA;
//
//public class Divisibility {
//    public static void main(String[] args) {
//
//    }
//
//    public static long digitSum(String number) {
//        long digitSum = 0;
//        for (int i = 0; i < number.length(); i++) digitSum += number.charAt(i) - '0';
//
//        return digitSum;
//    }
//
//    public static long alternateDigitSum(String number) {
//        long as = 0;
//        int i = 0;
//        if (number.charAt(0) == '-' || number.charAt(0) == '+') i = 1;
//        while (i < number.length()) {
//            as += number.charAt(i++) - '0';
//            if (i < number.length()) as -= number.charAt(i++) - '0';
//        }
//
//        return as;
//    }
//
//    public static boolean divisibleBy2(String number) {
////    A number is divisible by two if the last digit is one of them: 0, 2, 4, 6, 8
//        int last = number.length() - 1;
//        return number.charAt(last) == '0' || number.charAt(last) == '2' || number.charAt(last) == '4' || number.charAt(last) == '6' || number.charAt(last) == '8';
//    }
//
//    public static boolean divisibleBy3(String number) {
////        A number will divisible by 3 if sum of it's digit: digitSum is divisible by 3
////        This method can throw exception cause digitSum can be much bigger that's why primitives can not hold it
//
//        return digitSum(number) % 3 == 0;
//    }
//
//    public static boolean divisibleBy4(String number) {
////        A number will divisible by 4 if newNumber(that formed with last two digits of number) is divisible by 4
////        This method need to upgrade more
//        int newNumber = 0, numLen = number.length();
//        if (number.equals("0") || number.equals("4") || number.equals("8") || number.equals("-4") || number.equals(
//                "-8"))
//            return true;
//        if (number.length() == 1) return false;
//        newNumber = newNumber * 10 + number.charAt(numLen - 2) - '0';
//        newNumber = newNumber * 10 + number.charAt(numLen - 1) - '0';
//
//        return newNumber % 4 == 0;
//    }
//
//    public static boolean divisibleBy5(String number) {
////        A number will divisible by 5 if the last digit of that number either 0 or 5
//        number = number.trim();
//        return number.length() > 0 && (number.charAt(number.length() - 1) == '0' || number.charAt(number.length() - 1) == '5');
//    }
//
//    public static boolean divisibleBy6(String number) {
////        A number will divisible by 6 if the number is divisible by 2 and 3 at the same time
//        return divisibleBy2(number) && divisibleBy3(number);
//    }
//
//    public static boolean divisibleBy9(String number) {
////        Same as condition of divisibleBy3
//        return digitSum(number) % 9 == 0;
//    }
//
//    public static boolean divisibleBy11(String number) {
////        A number will divisible by 11 if alternateSumOfDigits is divisible by 11
////        Upgrade it by considering negatives.
//        number = number.trim();
//        if (number.equals("0")) return true;
//
//        return number.length() > 1 && !number.equals("10") && alternateDigitSum(number) % 11 == 0;
//    }
//
//    public static boolean divisibleBy15(String number) {
////        A number will divisible by 15 if the number is divisible by 3 and 5 at the same time
//        return divisibleBy3(number) && divisibleBy5(number);
//    }
//
//    public static boolean divisibleBy55(String number) {
////        A number will divisible by 55 if the number is divisible by 5 and 11 at the same time
//        return divisibleBy5(number) && divisibleBy11(number);
//    }
//
//    public static boolean divisibleBy100(String number){
//
//    }
//}
