// Linked List section.
// Accepted in third term after 5 months.
// Main concept form official solution section.
// Posted in twitter.
// 105 done.

/*
 * Using sentinel theory. Do your wanna learn more? Wiki it.
 */


package MonthlyChallenge2021.January;

import LinkedList.ListNode;

public class RemoveDuplicatesFromSortedList_II
{
    public ListNode deleteDuplicates(ListNode head)
    {
//        Considering edge case.
        if (head == null || head.next == null)
            return head;

        ListNode sentinel = new ListNode(0, head), predecessor = sentinel;
        while (head != null)
        {
            if (head.next != null && head.val == head.next.val)
            {
                while (head.next != null && head.val == head.next.val)
                    head = head.next;
                predecessor.next = head.next;
            }
            else
                predecessor = predecessor.next;

            head = head.next;
        }

        return sentinel.next;
    }
}
