package collection;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List 线性表，是可以存放重复元素且有序的集合。
 * List集合在Collection提供的功能基础上额外定义了一组可以通过下标操作元素的方法
 * List接口下面有两个常用的实现类
 * java.util.ArrayList:内部就是使用数组实现的List//ArrayList查询效率高，增删慢
 * java.util.LinkedList:内部是使用链表实现的List,//LinkedList增删效率高，查询效率慢，适合首尾插入
 * 在性能没有特别苛刻的要求时，通常使用ArrayList即可。
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four" );
        list.add("five");
        System.out.println(list);
        /**
         * E get(int index)
         */
//        String e = list.get(2);//array[2]
//        System.out.println(e);
//        for (int i = 0; i < list.size(); i++) {
//            e = list.get(i);
//            System.out.println(e  );
//        }
        /**
         * E set(int index,E e)
         * 将给定元素e 设置到指定下标index处。返回值为该下标被替换的元素
         */
//        String old = list.set(1,"six");
//        System.out.println(list);
//        System.out.println(old);
        /**
         * 将集合反转
         * set方法可以将指定下标的元素，替换成指定元素，并且返回替换的元素，
         * 如果需要进行反转，就需要将前面替换的值保存下来进行对后面的替换，那么就需要替换第二次，set
         * 如果不进行替换第二次，后面的元素就会被保留
         * [five,four,six, two, one]
         */String name ="";
        List<String>list1  = new ArrayList<>();
//        for (int i = 0; i < list.size()/2; i++) {//size这里代表了集合中的元素个数，而list实际上就是一个数组存储元素，如果不除以2就会来回替换
//            name = list.set(i, list.get(list.size()-i-1));//这里为什么需要get？需要得到list末尾的元素，需要get指定元素下标进行获取元素
////            System.out.println(list);
//            list.set(list.size()-i-1,name);
//        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
