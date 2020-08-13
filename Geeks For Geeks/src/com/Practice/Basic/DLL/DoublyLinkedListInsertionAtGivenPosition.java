// Correct Answer.
// Execution time for first acceptance: 3.44
// Ubuntu-Link: https://pastebin.ubuntu.com/p/fxK2F9GsdD/

package com.Practice.Basic.DLL;

import com.GFG.Node;

public class DoublyLinkedListInsertionAtGivenPosition
{
    void addNode(Node head_ref, int pos, int data)
    {
        int p = 0;
        Node Cur = head_ref, Next = head_ref.next, newNode = new Node(data);
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
