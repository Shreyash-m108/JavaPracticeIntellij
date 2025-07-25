package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(12, 34, 41, 36, 73);

        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(66);
        list2.add(87);
        list2.add(90);
        list2.add(48);

        List<Integer> list3 = Arrays.asList(56, 43, 67, 54, 59);

        //Use of Streams
        //On List 1
        /*//First make a stream of the list 
        Stream<Integer> stream1 = list1.stream();
        //use the methods of the stream variable
        List<Integer> evenNumber = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(evenNumber);*/

        //or we can do this in one line
        List<Integer> evenNumber = list1.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
