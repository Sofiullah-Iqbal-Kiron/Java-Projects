// Accepted in 3'rd term.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/6DgPPsDqKs/

package LinkedList;

public class RemoveLinkedListElements_203
{
    public ListNode removeElements(ListNode head, int val)
    {
        while (head != null && head.val == val)
            head = head.next;
        if (head != null && head.next != null)
        {
            ListNode previous = head, current = head.next;
            while (current != null && current.next != null)
            {
                while (current != null && current.val == val)
                    current = current.next;
                previous.next = current;
                previous = previous.next;
                if (current != null && current.next != null)
                    current = current.next;
            }
            if (current != null && current.val == val)
                previous.next = null;
        }

        return head;
    }
}
