package collection;

import com.sun.javafx.collections.SetListenerHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("Java");
        c1.add("android");
//
//        Collection c2 = new ArrayList();
//        c2.add("ios");
//        c2.add("love");
//        c2.add("ios");
//        c1.addAll(c2);//输出无序，是因为Set无序

//        System.out.println(c1);
//        System.out.println(c2);
        Collection c3 = new ArrayList();
//        c3.add(c1);//这里添加的是c1这个集合，而不是整个元素,[[Java, android, ios, love, ios]]
//        System.out.println(c3);
        c3.add("Java");
//        c3.add(c1);
//        c3.addAll(c1);
//        boolean m = c1.contains(c3);//判断集合里面的元素的时候必须使用cotainAll，
        // 使用contain则会判断是否包含这个集合
        boolean m  = c1.containsAll(c3);
//        System.out.println(m);
        c1.retainAll(c3);
//        System.out.println(c1);
        c1.remove(c3);//如果写的
        System.out.println(c1);
    }
}
