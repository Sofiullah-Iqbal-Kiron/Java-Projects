package com.RA;

public class ArrayCopy {
    private static void arrayCopy(int[] source, int[] destination) {
        try {
            if (source.length != destination.length) throw new Exception();
            for (int i = 0; i < source.length; i++) destination[i] = source[i];
        }
        catch (Exception e) {
            System.out.println("ArraysLengthNotSameException");
        }
    }
}
