package collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * java.util.Collection 接口（所以不能实例化），该接口是所有集合的顶级接口，里面定义了所有集合都要具备的功能
 * 集合与数组相似，可以保存一组元素，但是集合有多种不同的数据结构供我们选择，
 * 不同的结构体现不同的性能
 * 集合将元素的操作全部封装成方法，使用便捷，而数组需要自行编写代码来完成对元素的维护操作
 * Collection常用的分支
 * java.util.List:是一个接口，,特点:有序且重复（元素可重复）
 * java.util.Set:是一个接口，特点：不可重复（连着区别）
 * 元素重复标准：集合中是偶存在equals比较为true的元素
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("22");
        c.add("ww");
        c.add("ww");
        System.out.println(c);
        int size = c.size();//这里是指元素的个数
        //与length区别就在于，length表示的是数组的长度
        System.out.println(size);
        boolean isEmpty = c.isEmpty();
        //与c == null有区别，这个表示没有这个东西
        //isEmpty主要是对这个集合中是否有元素
        System.out.println(isEmpty);
        c.clear();
        isEmpty = c.isEmpty();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(isEmpty);
    }
}
