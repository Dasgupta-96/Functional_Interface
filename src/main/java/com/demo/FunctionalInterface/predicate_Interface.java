package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicate_Interface {

    public static void main(String[] args) {

        // Predicate Functional Interface-> it takes input and produces a boolean value.
        // it's used for filtering the records

      Predicate<Integer> val =  x->x%2==0;
        boolean test = val.test(42);
        System.out.println(test);

       Predicate<String> name=  str->str.equals("deb");
        boolean res = name.test("deb");
        System.out.println(res);

// Stream API -> It takes the data one by one from the collection or data structure to another method known as filter()or map()
// It should be applied on Data structure or a collections
        // it's a Java 8 feature

        // filter out even no
        List<Integer> list = Arrays.asList(10, 12, 15, 49, 17);
        List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(result);

        List<String> list1 = Arrays.asList("deb", "arka", "ankit", "aryan");
        List<String> a = list1.stream().filter(str->str.equals("deb")).collect(Collectors.toList());
        System.out.println(a);
// Letter Starts with A
        List<String> b = Arrays.asList("deb", "arka", "Ram", "Sneha");
        List<String> a1 = b.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());
        System.out.println(a1);
// filter out no greater than 50
        List<Integer> numbers = Arrays.asList(15, 30, 45, 60, 75, 90);
        List<Integer> no = numbers.stream().filter(n -> n > 50).collect(Collectors.toList());
        System.out.println(no);

        // sort the no
        List<Integer> no1 = Arrays.asList(90, 30,75 , 60, 15);
        List<Integer> collect = no1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
// filter out given words
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<String> w = words.stream().filter(str ->!str.equals("banana")).collect(Collectors.toList());
        System.out.println(w);

// remove duplicates
        List<Integer> wordsWithDuplicates = Arrays.asList(10,20,25,25,16);
        List<Integer> d = wordsWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(d);

// max even no
        List<Integer> number = Arrays.asList(5, 10, 15, 20, 25);
        Optional<Integer> max = number.stream().filter(n->n%2==0).max(Integer::compareTo);
        System.out.println(max);

        // max number in the list
        List<Integer> n1 = Arrays.asList(5, 10, 15, 20, 25);
        Optional<Integer> max1 = n1.stream().filter(n -> n % 2 != 0).max(Integer::compareTo);

        System.out.println(max1);

// filter out the words > 5 letter and convert into uppercase
        List<String> wd = Arrays.asList("apple", "banana", "orange");
        List<String> uc = wd.stream().filter(str -> str.length() > 5).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(uc);
    }
    }

