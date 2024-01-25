package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionFunctionalInterface {

    public static void main(String[] args) {

   // Function functional Interface-> it takes one input and produces one output

   Function<String, Integer> val= str->str.length();
        Integer name = val.apply("arkadeb");
        System.out.println(name);

        Function<Integer,Integer> no = n->n+10;
        Integer test = no.apply(10);
        System.out.println(test);

        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String> res = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(res);

        // filter out the word greater than 5 and convert it to uppercase
        List<String> words = Arrays.asList("apple", "banana", "orange") ;

        List<String> collect = words.stream().filter(n -> n.length() > 5).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);


//         flatMap is used to flatten nested lists, and then map is applied to transform each element.
// In flatMap() we convert nested list into stream
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> fm = list1.stream().flatMap(l->l.stream()).map(n->n*2).collect(Collectors.toList());
        System.out.println(fm);

        // concatenate words using flatmap
        List<String> words1 = Arrays.asList("apple", "banana");
        List<String> words2 = Arrays.asList("orange", "grape");

        List<String> concatenatedWords = Stream.of(words1,words2).flatMap(List::stream).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(concatenatedWords);

// findFirst: This method returns the first element of the stream, or an empty Optional if the stream is empty. It is deterministic, meaning it will consistently return the same result for a particular stream.
//
//findAny: This method returns any element of the stream, or an empty Optional if the stream is empty. It is non-deterministic in parallel streams, meaning it may return different results on multiple invocations for the same stream.

         List<String> ff = Arrays.asList("apple", "banana", "orange", "grape");
         Optional<String> first = ff.stream().findFirst();
         System.out.println(first);

         Optional<String> any = ff.stream().findAny();
         System.out.println(any);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        System.out.println(sum.orElse(0));

    }
}
