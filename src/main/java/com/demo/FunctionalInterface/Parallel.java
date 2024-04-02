package com.demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Parallel {
    public static void main(String[] args) {
// Any java code has one stream of processing they are executed sequentially. using parallel stream we devide the code into
// multiple stream, and they are executed in parallel on separate cores.

        List<Student> data = Arrays.asList(new Student("Arkadeb",80),

        new Student("Ankit",65),
        new Student("Tamal",82),
                new Student("Subham",75)
        );

        data.stream().filter(s->s.getScore()>65).limit(3).// Sequential Stream
                forEach(n->System.out.println(n.getName()));

        System.out.println(".....................................");
        // Parallel stream
        List<Student> data1 = Arrays.asList(new Student("Arkadeb",80),

                new Student("Ankit",65),
                new Student("Tamal",82),
                new Student("Subham",75)
        );

        data1.parallelStream().filter(s->s.getScore()>65).limit(3).// Sequential Stream
                forEach(n->System.out.println(n.getName()));

    }
}
