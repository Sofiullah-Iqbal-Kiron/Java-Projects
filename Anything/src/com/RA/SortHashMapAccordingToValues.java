// Comparable and Comparator tutorial: https://www.digitalocean.com/community/tutorials/comparable-and-comparator-in-java-example
// Sorting tutorial: https://www.digitalocean.com/community/tutorials/sort-hashmap-by-value-java

/*
 * Basic strategy is to get the values from the HashMap in a list then sort it.
 * Build the HashMap based on a new list.
 */

package com.RA;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMapAccordingToValues {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3, 4);
        map.put(5, 3);
        map.put(2, 2);
        map.put(7, 1);
        map = sortHashMapAccordingToValue(map);

        for (Entry<Integer, Integer> e : map.entrySet()) System.out.println(e.getKey() + " " + e.getValue());
    }

    public static HashMap<Integer, Integer> sortHashMapAccordingToValue(HashMap<Integer, Integer> hashMap) {
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) list.add(entry.getValue());

        Collections.sort(list);

        for (int num : list)
            for (Entry<Integer, Integer> entry : hashMap.entrySet())
                if (entry.getValue().equals(num))
                    sortedMap.put(entry.getKey(), num);

        return sortedMap;
    }
}