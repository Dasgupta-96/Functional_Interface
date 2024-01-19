package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeObject {

    public static void main(String[] args) {

        List<Employee> x = Arrays.asList(new Employee("Arkadeb", 25), new Employee("Ankit", 30),
                new Employee("Ram", 28));

        List<Employee> collect = x.stream().filter(e->e.getAge()>28).collect(Collectors.toList());

       for (Employee e:collect){

           System.out.println(e.getName());
           System.out.println(e.getAge());
       }
    }
}
