package Exercise.day04;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;
import java.util.function.Consumer;

//排序
public class SortList {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        List<String>list1 = new ArrayList<>();
        list1.add("one");
        list1.add("twod");
        list1.add("ia");
        list1.add("affasf");
        list1.add("s");
        System.out.println(list);
//        list1.forEach();

        list1.forEach(System.out::println);

//        String []arr = list1.toArray(new String[list1.size()]);
//        Arrays.asList(list1);
//        Collections.sort(list1,(o1,o2)->(o1.length()-o2.length()));
//        System.out.println(list1);
//        int i = new Random().nextInt(100);
//        for (int j = 0; j < 10; j++) {
//            list.add(new Random().nextInt(100));
//        }
//        System.out.println(list);
//        Collections.sort(list,(o1, o2) ->o1-o2);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        Collections.shuffle(list);
//        System.out.println(list);
    }
}
