package lambda;

import java.util.*;
import java.util.function.Consumer;

/**
 * JDK8之后，在集合Collection上提供了一个方法:
 *
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
//        list.forEach();
        list.forEach(s-> System.out.println(s));
//        Comparator comparator = new () ;
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
