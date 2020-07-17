package com.LinkedList;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedListII
{
    public ListNode deleteDuplicates(ListNode head)
    {
        final int lengthOfHead = length(head);
        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;
        for (int i = 0; i < lengthOfHead; i++)
        {
            if (count(temp.val, head) == 1)
                values.add(temp.val);
            temp = temp.next;
        }
        setValues(values, head);

        return head;
    }

    private void setValues(ArrayList<Integer> values, ListNode head)
    {
        if (values.isEmpty())
        {
            System.out.println(values.isEmpty());
            head = null;
            return;
        }
        final int lengthOfHead = length(head);
        int i = 0;
        for (; i < values.size() - 1; i++)
        {
            head.val = values.get(i);
            head = head.next;
        }
        head.val = values.get(i);
        head.next = null;
    }

    private int count(int val, ListNode head)
    {
        final int lengthOfHead = length(head);
        int count = 0;
        for (int i = 0; i < lengthOfHead; i++)
        {
            if (head.val == val)
                count++;
            head = head.next;
        }

        return count;
    }

    private int length(ListNode head)
    {
        int length = 0;
        while (head != null)
        {
            length++;
            head = head.next;
        }

        return length;
    }
}
