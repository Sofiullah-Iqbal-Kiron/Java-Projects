// betterCode-Link: https://leetcode.com/problems/rotate-list/discuss/738991/Java-A-clear-solution-only-with-tail-node.

package LinkedList.RotateList_61;

import LeetCode.LinkedList.ListNode;

public class RotateList_61_betterCode
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null)
            return null;
        int len = 1;
        ListNode tail = head;
        while (tail.next != null)
        {
            tail = tail.next;
            len++;
        }
        tail.next = head;

        // find the pre node of Kth from end
        for (int i = len - k % len; i > 0; --i)
            tail = tail.next;
        ListNode res = tail.next;
        tail.next = null;

        return res;
    }
}
