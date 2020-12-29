// Accepted in third term.
// Posted in twitter.
// Linked List Problem.
// It was done by me before this.


package MonthlyChallenge2020.December;

import LinkedList.ListNode;

public class SwapNodesInPairs
{
    public ListNode swapPairs(ListNode head)
    {
        if (head == null)
            return head;
        ListNode previous = head, current;
        int temp;

        if (head.next == null)
            return head;
        current = head.next;

        while (previous != null)
        {
            temp = current.val;
            current.val = previous.val;
            previous.val = temp;
            if (previous.next.next == null || current.next.next == null)
                break;
            current = current.next.next;
            previous = previous.next.next;
        }

        return head;
    }
}
