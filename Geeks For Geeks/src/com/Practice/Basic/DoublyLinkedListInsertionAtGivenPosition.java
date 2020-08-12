// Correct Answer.
// Execution time for first acceptance: 3.44
// Ubuntu-Link: https://pastebin.ubuntu.com/p/fxK2F9GsdD/

package com.Practice.Basic;

import com.GFG.DLLNode;

public class DoublyLinkedListInsertionAtGivenPosition
{
    void addNode(DLLNode head_ref, int pos, int data)
    {
        int p = 0;
        DLLNode Cur = head_ref, Next = head_ref.next, newNode = new DLLNode(data);
        while (p != pos)
        {
            Cur = Cur.next;
            Next = Next.next;
            p++;
            if (Next == null)
                break;
        }
        Cur.next = newNode;
        if (Next != null)
            Next.prev = newNode;
        newNode.prev = Cur;
        newNode.next = Next;
    }
}
