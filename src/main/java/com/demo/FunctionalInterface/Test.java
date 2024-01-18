package com.demo.FunctionalInterface;

import org.springframework.http.MediaTypeEditor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

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

        List<Integer> list = Arrays.asList(10, 12, 15, 49, 17);
        List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(result);

        List<String> list1 = Arrays.asList("deb", "arka", "ankit", "aryan");
        List<String> a = list1.stream().filter(str->str.equals("deb")).collect(Collectors.toList());
        System.out.println(a);
    }


}
