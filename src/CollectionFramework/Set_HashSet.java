package CollectionFramework;
import java.util.*;
public class Set_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(10);
        set.add(100);
        set.add(60);
        set.add(20);
        set1.add(23);
        set1.add(33);
        set1.add(73);
        set1.addAll(set);

        System.out.println(set);
        System.out.println(set1);

        set1.retainAll(set);
        System.out.println(set1);

    }
}
