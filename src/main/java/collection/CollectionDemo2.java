package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素的equals方法影响集合的某些操作，常见的有
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        c.add("13");
        c.add(new Point(4,6));
        c.add(new Point(4,6));
        c.add(new Point(4,5));
        c.add(new Point(6,2));
        System.out.println(c);
        c.remove("13");
        System.out.println(c);

        /**
         * 集合重写了toString方法，返回字符串数组
         * 【元素1.toString（）】
         * 因此如果元素没有妥善的重写toString方法
         * 所以需要对元素内部的类进行重写toString
         * boolean contains(Obiect o)
         * 判断当前集合是否包含给定元素，若包含则方法返回true
         * 否则返回false集合判断是否包含给定元素的逻辑为:
         * 给定素是否与集合现有元素存在equals 比较为true的情况，存在则认为包含该元素
         * 与这个元素是否在这个集合里无关
         * 对于list集合而言，如果删除的是集合中的重复元素，
         * remove
         * 那么仅会删除最靠前的第一个，而不是将所有equals为true的元素都删除
         */
//        System.out.println(c);
//        Point point = new Point(4, 6);
//        System.out.println(c.contains(point));
//        System.out.println(c.remove(point));
//        System.out.println(c);
    }
}
