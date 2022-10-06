//package com.Heap;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Heap {
//    private ArrayList<Integer> elements;
//    private int size;
//
//    public Heap() {
//        this.size = 0;
//        this.elements = new ArrayList();
//    }
//
//    public Heap(int initialSize) {
//        this.elements = new ArrayList<>(initialSize);
//        this.size = this.elements.size();
//    }
//
//    public void insert(T value) {
//        this.elements.add(value);
//
//        while (size - 1 > 0 && this.elements.get(size - 1).compareTo(this.elements.get(parentIndex(size - 1))) < 0) {
//
//        }
//    }
//
//    private int parentIndex(int index) {
//        return (index - 1) / 2;
//    }
//
//    private int compareTo(T ele) {
//        if (ele instanceof String) {
//
//        }
//
//        return 1;
//    }
//
//    public void printHeap() {
//        for (T ele : this.elements) System.out.print(ele + " ");
//        System.out.println();
//    }
//}
