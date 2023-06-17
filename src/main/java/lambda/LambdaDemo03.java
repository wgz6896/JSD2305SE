package lambda;

import java.util.*;

/**
 * JDK8之后，List集合本身也通过了sort方法，可以基于一个比较规则排序
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("one");
        list.add("twofg");
        list.add("faf");
        list.add("f");
        list.sort(Comparator.comparingInt(String::length));//==Collections.sort(list,(o1,o2)->(o1.length-o2.length))
        Collections.reverse(list);
        System.out.println(list);
    }
}
