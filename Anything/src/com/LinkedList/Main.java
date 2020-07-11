package com.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Node head = new Node(0), first = new Node(3), second = new Node(2), third = new Node(1), fourth = new Node(4);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        LinkedList.add(5, head);
        LinkedList.add(2, -1, head);
        LinkedList.printList(head);
        LinkedList.sort(head);
        LinkedList.printList(head);
        Node newList = new Node(2, null);
        for (int j : new int[] {5, 67, 2, 100})
        {
            LinkedList.add(j, newList);
        }
        LinkedList.merge(head, newList);
        LinkedList.sort(head);
        LinkedList.printList(head);
    }
}
