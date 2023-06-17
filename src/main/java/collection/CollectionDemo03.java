package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合仅能存放引用类型元素， 并且保存的也是元素的地址，也就是只能存，类，接口，数组
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1, 2);
        //当我们存入基本类型元素时，会触发编译器的自动装箱特性
        c.add(p);
        System.out.println(p);
        System.out.println(c);
        p.setX(3);
        System.out.println("p = "+p);
        System.out.println("c =" +c);
    }
}
