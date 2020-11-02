package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node() {}

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    public static void append(int data, Node head)
    {
        if (head == null)
        {
            head = new Node(data);
            return;
        }

        while (head.next != null)
            head = head.next;
        head.next = new Node(data);
    }

    public static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        newLine();
    }

    public static void merge(Node one, Node two)
    {
        while (one.next != null)
            one = one.next;
        one.next = two;
    }

    public static void reverseList(Node head)
    {
        int[] data = new int[length(head)];
        Node current = head;
        int i = 0;
        while (current != null)
        {
            data[i++] = current.data;
            current = current.next;
        }
        i--;
        while (head != null)
        {
            head.data = data[i--];
            head = head.next;
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

    private static void newLine()
    {
        System.out.println();
    }
}

public class ReverseLinkedList
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int N = input.nextInt();
        Node mainList = new Node(), ansList = new Node(), subList = new Node();
        for (int takeValue = 0; takeValue < N; takeValue++)
            LinkedList.append(input.nextInt(), mainList);

        while (mainList != null)
        {
            if (mainList.data % 2 == 0)
                LinkedList.append(mainList.data, subList);
            else
            {
                LinkedList.reverseList(subList);
                LinkedList.merge(ansList, subList);
                subList = new Node();
                LinkedList.append(mainList.data, ansList);
            }
            mainList = mainList.next;
        }

        LinkedList.printList(ansList);
    }
}
