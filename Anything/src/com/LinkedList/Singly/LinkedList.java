package com.LinkedList.Singly;

import java.util.Arrays;

import static com.RA.Main.newLine;

public class LinkedList
{
    public static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        newLine();
    }

    public static void add(int data, Node head)
    {
        while (head.next != null)
            head = head.next;
        head.next = new Node(data, null);
    }

    public static void add(int index, int data, Node head)
    {
        if (index > length(head))
        {
            System.out.println("IndexCrossedLengthException");
            return;
        }
        else if (index == length(head))
        {
            add(data, head);
            return;
        }
        else if (index == 0)
        {
            Node newNode = new Node(data, head);
            return;
        }
        int headPosition = 0;
        Node newNode = new Node(data);
        Node headNext = head.next;
        while (true)
        {
            if (headPosition == index - 1)
            {
                head.next = newNode;
                newNode.next = headNext;
                break;
            }
            head = head.next;
            headPosition++;
            headNext = headNext.next;
        }
    }

    public static int length(Node head)
    {
        int length = 0;
        while (head != null)
        {
            length++;
            head = head.next;
        }

        return length;
    }

    public static void sort(Node head)
    {
        int length = length(head);
        int[] data = new int[length];
        int i;
        Node temp = head;
        for (i = 0; i < length; i++)
        {
            data[i] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(data);
        for (i = 0; i < length; i++)
        {
            head.data = data[i];
            head = head.next;
        }
    }

    public static void swapData(Node first, Node second)
    {
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    public static void merge(Node one, Node two)
    {
        while (one.next != null)
        {
            one = one.next;
        }
        one.next = two;
    }
}
