package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// A class representing an example entity (e.g., a Employee)
class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getid() {
        return id;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare Employees based on id
        return Integer.compare(this.id, otherEmployee.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// A custom comparator to sort Employees based on their names
class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee Employee1, Employee Employee2) {
        return Employee1.getName().compareTo(Employee2.getName());
    }
}

public class CollectionComparatoreg {
    public static void main(String[] args) {
        // Creating a list of Employees
        List<Employee> EmployeeList = new ArrayList<>();
        EmployeeList.add(new Employee("John", 25));
        EmployeeList.add(new Employee("Alice", 30));
        EmployeeList.add(new Employee("Bob", 22));
        EmployeeList.add(new Employee("Eva", 28));

        // Sorting using Comparable (based on id)
        Collections.sort(EmployeeList);
        System.out.println("Sorted by id (Comparable):");
        displayEmployees(EmployeeList);

        // Sorting using Comparator (based on name)
        Collections.sort(EmployeeList, new EmployeeNameComparator());
        System.out.println("\nSorted by name (Comparator):");
        displayEmployees(EmployeeList);
    }

    // Helper method to display the list of Employees
    private static void displayEmployees(List<Employee> Employees) {
        for (Employee Employee : Employees) {
            System.out.println(Employee);
        }
    }
}
