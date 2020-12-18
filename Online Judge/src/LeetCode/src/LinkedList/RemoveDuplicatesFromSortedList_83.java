// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/RFcjCMdnSt/


package LinkedList;

import java.util.*;

public class RemoveDuplicatesFromSortedList_83
{
    public ListNode deleteDuplicates(ListNode head)
    {
        final int lengthOfHead = length(head);
        Set<Integer> valuesSet = new HashSet<Integer>();
        int i = 0;
        ListNode temp = head;
        for (; i < lengthOfHead; i++)
        {
            valuesSet.add(temp.val);
            temp = temp.next;
        }
        List<Integer> valuesList = new ArrayList<>(valuesSet);
        Collections.sort(valuesList);
        setValues(valuesList, head);

        return head;
    }

    private void setValues(List<Integer> valuesList, ListNode head)
    {
        if (valuesList.isEmpty())
        {
            head = null;
            return;
        }
        int i = 0;
        for (; i < valuesList.size() - 1; i++)
        {
            head.val = valuesList.get(i);
            head = head.next;
        }
        head.val = valuesList.get(i);
        head.next = null;
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

// ServerCode.
/*class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null)
        {
            if (cur.val == prev.val)
                cur = cur.next;
            else
            {
                prev.next = cur;
                prev = prev.next;
                cur = cur.next;
            }
        }
        if (prev.next != null && prev.val == prev.next.val)
            prev.next = null;
        return head;
    }
}*/

    // JudgesCode
    /*public ListNode deleteDuplicates(ListNode head)
    {
        ListNode current = head;
        while (current != null && current.next != null)
        {
            if (current.next.val == current.val)
                current.next = current.next.next;
            else
                current = current.next;
        }

        return head;
    }*/
