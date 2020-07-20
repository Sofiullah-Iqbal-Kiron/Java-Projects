package com.JulyLeetCodingChallenge;

import com.LinkedList.ListNode;

import java.util.ArrayList;

public class RemoveLinkedListElements
{
    public ListNode removeElements(ListNode head, int val)
    {
        if (head == null)
            return head;
        ArrayList<Integer> values = new ArrayList<>();
        getData(values, head);
        removeData(values, val);
        setData(values, head);

        return head;
    }
    private void setData(ArrayList<Integer> values, ListNode head)
    {
        if (values.size() == 0)
            return;
        int i;
        for (i = 0; i < values.size() - 1; i++)
        {
            head.val = values.get(i);
            head = head.next;
        }

        head.val = values.get(i);
        head.next = null;
    }
    private void removeData(ArrayList<Integer> values, int val)
    {
        while (values.contains(val))
            values.remove(val);
    }
    private void getData(ArrayList<Integer> values, ListNode head)
    {
        while (head != null)
        {
            values.add(head.val);
            head = head.next;
        }
    }
}
