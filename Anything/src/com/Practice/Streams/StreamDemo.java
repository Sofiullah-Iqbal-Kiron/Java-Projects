package com.Practice.Streams;

// Ultimate java mastery course of Mosh.

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }
}
