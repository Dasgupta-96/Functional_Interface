package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;



public class test {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("deb", "ankit", "tamal", "sambhu");

        Consumer<String> val = s-> System.out.println(s);
        list.forEach(val);

       Supplier<Integer> data= ()-> new Random().nextInt(100);
        Integer i = data.get();Object sout;
        System.out.println(i);


    }

}
