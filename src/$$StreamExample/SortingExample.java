package $$StreamExample;

import java.util.*;
import java.util.stream.Collectors;

public class SortingExample {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");


        //sort with Collections
        Collections.sort(fruits);
        System.out.println(fruits);

        //reverse
        Collections.sort(fruits,(a1,a2) -> a2.compareTo(a1));
        System.out.println(fruits);

        System.out.println("=============== Stream Sorting ==================");
        //stream sorting

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);


        fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);


        List<String> sortedList1 = fruits.stream().sorted(((o1, o2) -> o1.compareTo(o2))).collect(Collectors.toList());
        System.out.println("sortedList1 = " + sortedList1);

        List<String> sortedList3 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList3 = " + sortedList3);


        System.out.println("================= reverse order stream =================");

        List<String> sortedList4= fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sortedList4 = " + sortedList4);

        List<String> sortedList5 = fruits.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.out.println("sortedList5 = " + sortedList5);


        System.out.println("================ sort employee by salary in ascending order ===============");


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Ramesh",30, 400000l));
        employees.add(new Employee(20,"Santosh",29, 350000l));
        employees.add(new Employee(30,"Sanjay",30, 450000l));
        employees.add(new Employee(40,"Pramod",29, 500000l));

        List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeesSortedList);

        List<Employee> employeesSortedList2 = employees
                .stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeesSortedList2);


        //reverse order salary
        List<Employee> employeesSortedList3 = employees
                .stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeesSortedList3);

        //simplest way of ascending order
        List<Employee> employeesSortedList4 = employees
                .stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(employeesSortedList4);

        //simplest way of descending order
        List<Employee> employeesSortedList5 = employees
                .stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(employeesSortedList5);

        //sorted by the name ascending
        List<Employee> employeesSortedList6 = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(employeesSortedList6);

        //sorted by the name ascending

        List<Employee> employeesSortedList7 = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());

        System.out.println(employeesSortedList7);







    }

}


