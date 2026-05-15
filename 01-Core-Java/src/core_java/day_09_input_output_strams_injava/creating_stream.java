package day_09_input_output_strams_injava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class creating_stream {

    public static void main(String ar[])
    {

        // Collection to Stream
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Stream<String> myStream = list.stream();

        myStream.forEach(System.out::println);

        // Array to Stream
        String[] array =
            {"apple", "banana", "cherry"};

        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);

        // Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3);integerStream.forEach(System.out::println);

        // iterate()
        Stream<Integer> limit =Stream.iterate(0, n -> n + 1).limit(10);

        limit.forEach(System.out::println);

        // generate()
        Stream<Integer> limit1 =
            Stream.generate(() ->
                (int)(Math.random() * 100))
                  .limit(12);

        limit1.forEach(System.out::println);
    }
}

