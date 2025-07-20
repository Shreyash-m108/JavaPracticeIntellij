package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("Z");
        set.add("G");
        set.add("I");
        set.add("B");

        for(String s:set){
            System.out.println(s);
        }
    }
}
