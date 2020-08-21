// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/tnQyMpnwY3/

package com.LinkedList;

public class ReverseLinkedList_206
{
    public ListNode reverseList(ListNode head)
    {
        int[] data = new int[length(head)];
        ListNode temp = head;
        int i, j;
        for (i = 0; i < data.length; i++)
        {
            data[i] = temp.val;
            temp = temp.next;
        }
        int[] reverseData = new int[data.length];
        for (i = data.length - 1, j = 0; i >= 0; i--, j++)
        {
            reverseData[j] = data[i];
        }
        setReverseData(reverseData, head);

        return head;
    }

    private void setReverseData(int[] reverseData, ListNode head)
    {
        for (int x : reverseData)
        {
            head.val = x;
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
