// Accepted in first submission.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/H35KV7XrVM/

package com.LinkedList;

public class SwapNodesinPairs_24
{
    public ListNode swapPairs(ListNode head)
    {
        int[] arr = new int[lenght(head)];
        getData(arr, head);
        swapData(arr);
        setData(arr, head);

        return head;
    }

    private void setData(int[] arr, ListNode head)
    {
        int i;
        for (i = 0; i < arr.length; i++)
        {
            head.val = arr[i];
            head = head.next;
        }
    }

    private void swapData(int[] arr)
    {
        int i;
        for (i = 0; i < arr.length - 1; i += 2)
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    private void getData(int[] arr, ListNode head)
    {
        int i;
        for (i = 0; i < arr.length; i++)
        {
            arr[i] = head.val;
            head = head.next;
        }
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
}
