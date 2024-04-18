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

         List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
         double data1 = data.stream().mapToInt(d->d).average().getAsDouble();
         System.out.println(data1);

         // multiply all no, if no is greater than 100 then find the avg of those no
         List<Integer> a = Arrays.asList(1, 10, 20, 15, 30);
         double d = a.stream().map(s -> s * s).filter(n -> n > 100).mapToInt(e -> e).average().getAsDouble();
         System.out.println(d);
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

// findFirst: This method returns the first element of the stream, or an empty Optional if the stream is empty. It is deterministic, meaning it will consistently return the same result for a particular
//findAny: This method returns any element of the stream, or an empty Optional if the stream is empty. It is non-deterministic in parallel streams, meaning it may return different results on multiple invocations for the same stream.

         List<String> ff = Arrays.asList("apple", "banana", "orange", "grape");
         Optional<String> first = ff.stream().findFirst();
         System.out.println(first);

         Optional<String> any = ff.stream().findAny();
         System.out.println(any);

         // Find the second smallest element
         List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
         Integer i = nums.stream()
                 .distinct()
                 .sorted().skip(1).findFirst().orElse(null);
         System.out.println(i);

//         Find the second largest element
//        Integer i = nums.stream()
//                .distinct()
//                .sorted((a, b) -> b.compareTo(a)).skip(2)
//                .findFirst().orElse(null); // sorted in desending order
//        System.out.println(i);

         // sum of all even numbers
         List<Integer> data2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

         int sum = data2.stream().filter(n -> n % 2 == 0).mapToInt(e -> e).sum();

         System.out.println(sum);

         // peek : it's an intermediate operation, takes consumer interface, it returns stream consisting of current element
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

         List<Integer> collect1 = numbers.stream()
                 .peek(num -> System.out.println("Original Number: " + num)).collect(Collectors.toList());

         System.out.println(collect1);


         List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
         n.stream().filter(s -> s % 2 == 0).peek(System.out::println).map(c->c+c).forEach(b-> System.out.println(b));

         //Intermediate Operation: the operation which returns another stream as result. they are lazy. ex:filter(),map(), distinct(),sorted(),skip(),peek()
// in intermediate operation they can be chained, they dont produce end result


   //Terminal: the operation which return non stream values like primitive , object,or return nothing. ex: forEach(),reduce(),count(),max(),findFirst()
// they cant be chained together, and they produce end result

   //Reduce(): it combines the elements of a stream and produce single values, it takes binary operator

         List<Integer> even = Arrays.asList(2, 4, 6, 8);
         Integer i1 = even.stream().reduce((b, c) -> b + c).get();
         System.out.println(i1);
    }
}
