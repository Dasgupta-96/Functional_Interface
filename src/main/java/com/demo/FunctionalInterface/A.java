package com.demo.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {

        String[] str = {"apple", "banana", "grapes", "avocado"};

        int i = Arrays.stream(str).mapToInt(s -> s.length()).max().orElse(0);
        System.out.println(i);

        int[] x = {1, 2, 3, 3, 4};
        Map<Integer, Long> data = Arrays.stream(x).boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(data);

        String s = "abcccd";


        Map<Character, Long> s1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(s1);

        int[] a = {5, 2, 6, 7, 7, 9, 8, 5};

        Map<Integer, Long> m = Arrays.stream(a).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        m.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(d -> System.out.println("Duplicates are " + d.getKey()));


        String[] f = {"a", "b", "c", "c", "d", "e", "e"};

        Map<String, Long> c = Arrays.stream(f).collect(Collectors.groupingBy(b -> b, Collectors.counting()));
        c.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(e -> System.out.println("Duplicates are " + e.getKey()));

    }

}
