package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ColLection接口为遍历元素提供了方法:Iterator iterator()
 * 该方法会返回一个用于遍历当前集合元素的迭代器
 * java.util.Iterator接口，送代器接口。
 * 不同的集合都提供了用于遍历自身元素的迭代器实现类，我们无需关心实现类的名字，
 * 送代器式: 遍历集合遵循的步: 问->取-删删除元素不是遍历的必要操作)
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        Iterator it = c.iterator();//就是指，我要这个方法，而不是创建了新对象
        while(it.hasNext()){
            String e = (String)it.next();
            System.out.println(e);
        }
        //开发中当出现字符串变量与字面量equals时，要用字面量。equals
        //避免因为变量
    }
}
