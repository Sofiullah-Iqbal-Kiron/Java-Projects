// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/B7MxFymSTf/

package com.LinkedList;

import java.util.Arrays;

public class MergekSortedLists_23
{
    public ListNode mergeKLists(ListNode[] lists)
    {
        if (lists.length == 0 || allNull(lists))
            return null;
        int i = 0;
        ListNode main;
        while (lenght(lists[i]) == 0)
        {
            i++;
        }
        main = lists[i];

        int totalSize = lenght(main);
        i++;
        int start = i;
        for (; i < lists.length; i++)
        {
            totalSize += lenght(lists[i]);
        }
        int[] arr = new int[totalSize];
        for (i = start; i < lists.length; i++)
        {
            merge(main, lists[i]);
        }
        ListNode temp = main;
        for (i = 0; i < totalSize; i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        setValue(arr, main);

        return main;
    }

    private boolean allNull(ListNode[] lists)
    {
        int i;
        for (i = 0; i < lists.length; i++)
        {
            if (lenght(lists[i]) > 0)
                return false;
        }

        return true;
    }

    private int lenght(ListNode head)
    {
        int length = 0;
        while (head != null)
        {
            length++;
            head = head.next;
        }

        return length;
    }

    private void merge(ListNode one, ListNode two)
    {
        while (one.next != null)
        {
            one = one.next;
        }
        one.next = (lenght(two) == 0 ? null : two);
    }

    private void setValue(int[] values, ListNode head)
    {
        int i;
        for (i = 0; i < values.length; i++)
        {
            head.val = values[i];
            head = head.next;
        }
    }
}

// Server Solution.
/*class Solution
{
    public ListNode mergeKLists(ListNode[] lists)
    {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>()
        {
            @Override
            public int compare(ListNode o1, ListNode o2)
            {
                return o1.val - o2.val;
            }
        });

        for (ListNode node : lists)
        {
            if (node != null)
            {
                pq.add(node);
            }
        }

        if (pq.isEmpty())
        {
            return null;
        }

        ListNode head = pq.poll(), temp = head;
        if (temp.next != null)
        {
            pq.add(temp.next);
        }

        while (!pq.isEmpty())
        {
            temp.next = pq.poll();
            temp = temp.next;
            if (temp.next != null)
            {
                pq.add(temp.next);
            }
        }

        return head;
    }
}*/
