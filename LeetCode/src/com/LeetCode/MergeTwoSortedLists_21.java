// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/m362tZvNvv/

package com.LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedLists_21
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (length(l1) == 0 && length(l2) == 0)
            return null;
        if (length(l1) != 0)
            merge(l1, l2);
        else
        {
            sort(l2);
            return l2;
        }
        sort(l1);

        return l1;
    }

    public void merge(ListNode l1, ListNode l2)
    {
        if (length(l1) == 0)
        {
            l1 = l2;
            return;
        }
        else if (length(l2) == 0)
        {
            return;
        }
        while (l1.next != null)
        {
            l1 = l1.next;
        }
        l1.next = l2;
    }

    public void sort(ListNode head)
    {
        int length = length(head), i;
        int[] dataSet = new int[length];
        ListNode temp = head;
        for (i = 0; i < length; i++)
        {
            dataSet[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(dataSet);
        for (i = 0; i < length; i++)
        {
            head.val = dataSet[i];
            head = head.next;
        }
    }

    public int length(ListNode head)
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