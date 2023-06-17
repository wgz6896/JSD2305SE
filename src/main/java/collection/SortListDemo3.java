package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("五");
        list.add("基本覅书法家");
        list.add("五六七");
        list.add("五六");

        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
      Collections.sort(list,(o1, o2) ->o1.length()-o2.length());
        System.out.println(list);
    }
}
