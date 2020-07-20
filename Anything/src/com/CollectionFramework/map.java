package com.CollectionFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class map
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new TreeMap<>();
        map.put(5, "Kiron");
        map.put(3, "Nirob");
        map.put(9, "JaniNa");
        map.put(4, "JanoNa");
        map.put(4, "Tmi"); // By key, value will be changed.

        for (Map.Entry<Integer, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        anotherShow();
    }

    private static void anotherShow()
    {
        int[] arr = {1, 1, 1, 2, 2, 3};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr)
        {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
