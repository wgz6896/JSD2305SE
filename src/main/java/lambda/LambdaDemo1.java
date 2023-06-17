package lambda;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JDK8之后推出的新特性:Lambda表达式
 * Lambda表达式可以用更精简的语法创建匿名内部类，使得我们更关注重写方法的逻辑
 * 语法:(参数列表) ->{方法体
 * }
 * 注意: 只有实现的接口中仅包含一个抽象方法时，才可以使用lambda表达式
 * 在java API中凡是可以用lambda表达式的接口都有注解
 * :@FunctionalInterface但是没有该注解，也满足该接口只有一个抽象方法时仍然可以使用Lambda
 * 在集合排序时，定义比较器时的接口: Comparator就可以使用Lambda表达式创建
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("tom");
        list.add("waffa");
        list.add("qw");
        list.add("d");
        System.out.println(list);
//        Comparator<String>com = (o1, o2) -> o1.length()-o2.length();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(list);
    }
}
