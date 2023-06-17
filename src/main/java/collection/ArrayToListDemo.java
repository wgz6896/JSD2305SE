package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类:java.utl.Arrays提供了一个静态方法:asList,可以将一个数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String []arr = {"ont","two","three"};
        List<String> list =Arrays.asList(arr);
        System.out.println(list);
        list.set(1,"six");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
//        list.add("4");//数组是定长的不能进行增删操作
        //如果需要增删就需要创建一个新的集合
        List<String>list1 = new ArrayList<>(list);
//        List<String>list2 = new ArrayList<>(list);
//        list2.addAll(list1);
//        System.out.println("l2="+list2);
        list1.add("dd");
        System.out.println(list1);

    }
}
