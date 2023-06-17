package collection;

import sun.font.FontRunIterator;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * List集合支持获取子集
 * List subList(int start,int end)
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
//        System.out.println(list);
//        List<Integer>subList = list.subList(3,8);
//        System.out.println(list);
//        for (int i = 0; i < subList.size(); i++) {
//            Integer n = list.get(i)*10;
//            list.set(i,n);
//        }
//        System.out.println(list);
//        System.out.println(subList);
//        for (int i = 0; i < list.size(); i++) {
            List<Integer> subList = list.subList(2,9);
        subList.clear();
            //清空子集，对子集的操作就是对原集合的改操作
//        }
        System.out.println(list);
    }
}
