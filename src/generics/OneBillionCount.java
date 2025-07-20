package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneBillionCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shreyash");
        list.add("Hemant");
        list.add("Lolly");
        list.add("Shreyash");

        List<String> unmodify = Collections.unmodifiableList(list);
        try {
            unmodify.add("sads");
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
