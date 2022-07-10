package com.RA;

import java.util.ArrayList;
import java.util.List;

public class TripletGenerator {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        printTriplets(triplets(array));
    }

    private static List<List<Integer>> triplets(int[] input) {
        List<List<Integer>> triplets = new ArrayList<>();
        int len = input.length;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++)
                for (int k = j + 1; k < len; k++) triplets.add(List.of(input[i], input[j], input[k]));

        return triplets;
    }

    private static void printTriplets(List<List<Integer>> input) {
        for (List<Integer> list : input) System.out.println(list.toString());
    }
}
