package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {

        String [] str = {"apple","banana","grapes","avocado"};

        int i = Arrays.stream(str).mapToInt(s -> s.length()).max().orElse(0);
        System.out.println(i);

        int[] x = {1, 2, 3, 3, 4};
        Map<Integer, Long> data = Arrays.stream(x).boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(data);

        String s = "abcccd";

        Map<Character, Long> s1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(s1);

    }

}
