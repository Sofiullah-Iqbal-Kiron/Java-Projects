/*
 * Java provides Comparable interface which should be implemented by any custom class if we want to use
 * Arrays or Collections sort method. That is, implement the compareTo(Object obj);.
 */

package com.Practice.Comparable;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public long getSalary() {
        return this.salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        Arrays.sort(empArr);

        for (Employee e : empArr) System.out.println(e.toString());
    }
}
