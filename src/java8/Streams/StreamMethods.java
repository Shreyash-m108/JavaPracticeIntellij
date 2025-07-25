package java8.Streams;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        //Stream has many methods like filter,map,max,min,etc.
        //suppose we have a lists
        List<String> names = List.of("Shreyash", "Gaurav", "Digvijay", "Rushikesh", "Shardul","Gukesh");
        List<Integer> numbers = List.of(12, 43, 22, 7, 20, 31, 24);


        //1.Filter(): used when we need to filterout some element based on the condition like True/False
        //suppose we have to find the names starts with S then we use filter for this task
        names.stream().filter(e->e.startsWith("S")).forEach(System.out::println);
        //same with letter D
        names.stream().filter(e->e.startsWith("D")).forEach(System.out::println);
            //suppose we need only even numbers from the list
        numbers.stream().filter(e->e%2==0).forEach(e-> System.out.print(e+" "));

        //2.Map(): used when we need to do operation on each item in collection like squaring the integer like that
        numbers.stream().map(e->e*e).forEach(e-> System.out.print(e+" "));


        //3.sorted(): as name suggests it used to sort the elements
        numbers.stream().sorted().forEach(e-> System.out.print(e+" "));
        names.stream().sorted().forEach(e-> System.out.println(e+" "));


        //4.min() and max(): used to collect the minimum nad maximum element from collection, it uses comparator
        //to compare the element
        Integer minElement = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(minElement);

        Integer maxElement = numbers.stream().max(Integer::compareTo).get();
        System.out.println(maxElement);


    }
}
