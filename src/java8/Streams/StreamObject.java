package java8.Streams;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //we have array we use the stream on this array
        String[] cities = {"Sangli","Kolhapur","Delhi","Pune","Bengaluru"};

        //1. Make a stream on cities
        Stream<String> cityStream = Stream.of(cities);
        //use the stream methods on this like forEach
        cityStream.forEach(i-> System.out.println(i));
    }
}
