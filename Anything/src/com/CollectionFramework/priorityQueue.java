package com.CollectionFramework;

import java.util.*;

// Priority Queue is a tree-based data-structure that are implemented by heap(Generally min-heap).
// It do not follows First-In-First-Out algorithm.
// Head element is always min element.
/*
 * Basic methods of PriorityQueue:
 * boolean add(element): used to add an element.
 * When priorityQueue is null, it will return null.
 * public peek(): Retrieves(Not remove) head element. Peek: look quickly, typically in a furtive manner. Peek: উঁকি
 * public poll(): Retrieves and remove head. Poll: ভোটগ্রহণ।
 * Access element by an iterator: Iterator nameIterator = collectionName.iterator();
 * boolean remove(element);
 */

/*
 * PriorityQueue Constructors:
 * 1. PriorityQueue(): Default constructor with 11 initial capacity.
 * 2. PriorityQueue(Collection<E> c): With initial elements of this collection.
 * 3. PriorityQueue(int initialCapacity)
 * 4. PriorityQueue(int initialCapacity, Comparator<E> comparator): Creates a PriorityQueue with
 * initialCapacity that stores the elements according to the specified order.
 * 5. PriorityQueue(PriorityQueue<E> c)
 * 6. PriorityQueue(SortedSet<E> c)
 */

/*
 * java.util.PriorityQueue.comparator()
 * methods shares an important function of setting and returning the comparator
 * that ca be used to order the elements in a PriorityQueue.
 * The method return null value if the ordering pattern follows natural comparison.
 */

public class priorityQueue
{
    public static void main(String[] args)
    {
        // \u000d System.out.println("ami");
        /*PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(2);
        pq.add(9);
        for (int i : pq)
            System.out.print(i + " ");

        Iterator it = pq.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

        pq.offer(89);
        it = pq.iterator(); // Iterator came at the ending part.
        while (it.hasNext())
            System.out.println(it.next() + " ");*/

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((n1, n2) -> (n2 - n1));
        for (int i : new int[] {99, 1, 3, 2, 77, 41})
            pq2.add(i);

//        Least value always comes at begin position
        while (pq2.size() != 0)
        {
            System.out.println(pq2);
            pq2.poll();
        }

        ArrayList<Integer> arrayList = new ArrayList<>(100);
        for (int i : new int[] {8, 1, 4, 6, 3, 6})
            arrayList.add(i);

        pq2.addAll(arrayList);
        System.out.println(pq2);
    }
}
