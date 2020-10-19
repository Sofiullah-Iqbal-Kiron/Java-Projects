// Accepted in first term.
// Take some help form PickOne official solution, this is a approach for two-pointer.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/jvVMTMHgJQ/

package com.LinkedList;

public class PartitionList_86
{
    public ListNode partition(ListNode head, int x)
    {
        ListNode beforeList = new ListNode(0);
        ListNode before = beforeList;
        ListNode afterList = new ListNode(0);
        ListNode after = afterList;

        while (head != null)
        {
            if (head.val < x)
            {
                before.next = head;
                before = before.next;
            }
            else
            {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        before.next = afterList.next;
        after.next = null;

        return beforeList.next;
    }
}
