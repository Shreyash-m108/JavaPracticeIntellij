package CollectionFramework;
import java.util.*;
public class List_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(93);
        list.add(14);
        list.add(45);
        list.add(26);
        list.add(17);
        list.add(68);
        list.add(119);
        List<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);
        System.out.println(list);
        /*list.remove(Integer.valueOf(45));*/
        System.out.println(list.containsAll(list1));

    }
}
