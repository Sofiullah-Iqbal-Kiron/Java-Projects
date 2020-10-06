package com.GfG.ComparatorInterfaceInJavaWithExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    String name, address;
    int roll;

    public Student(String name, int roll, String address)
    {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public String toString()
    {
        return this.name + " " + this.roll + " " + this.address;
    }
}

class SortByName implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}

class SortByAddress implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.address.compareTo(s2.address);
    }
}

class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Kiron", 65, "Madaripur"));
        list.add(new Student("Miron", 73, "Faridpur"));
        list.add(new Student("Chiron", 11, "Dhaka"));

        Collections.sort(list, new SortByName());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println();
        Collections.sort(list, new SortByAddress());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
