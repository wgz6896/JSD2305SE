package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5之后推出了一个新特性: 增强for 循环。
 * 也称为新循环新循环的作用是使用相同的语法遍历集合或数组注意:
 * 新循环不取代传统循环的工作。
 * 语法:
 * for(元素类型 变量名 : 集合或数组){
 * ....}
 *
 *
 *
 *
 * JDK5推出的另一个新特性: 泛型泛型称为参数化类型，
 * 它允许我们在使用一个类时去指定该类某个属性，
 * 或方法参数或方法返回值的类型使得我们使用该类更灵活。
 */
public class NewForDemo {
    public static void main(String[] args) {
        String []array = {"one","two","three"};//使用了泛型以后，可以避免一些造型，更具有复用性
        for (String e : array) {
            /*
            * 增强型for循环的特定性是编译器认可的，而非虚拟机。
              当编译器编译代码时发现使用新循环遍历数组时，会将其改为普通的for循环进行
            * */
            System.out.println(e);
        }
        Collection<String>/*泛型指的其实只是，假装是字符串类型，实际上并不是，只是让编译器以为是*/
                c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
//        for (Object e:c) {//他不考虑你传入的是什么类型的数据，所以集合里统一都是Object，
//            //然后：前与：后的类型应该要一致，如果需要进行造型可以在代码块中处理
//            String s = (String)e;
//            System.out.println(e);
//        }
        for (String e:c) {
            System.out.println(e);
        }
        Iterator<String> iterator = c.iterator();
        //迭代器的泛型的类型应该与后面指向的类型一致，c是什么前面就是什么泛型
        while(iterator.hasNext()){
            String  b = iterator.next();
            System.out.println(b);
        }
        Iterator iterator1/*如果没有声明泛型的类型，则默认是Object类型*/
        = c.iterator();
        while(iterator1.hasNext()){
            String c1 = (String)iterator1.next();
            //如果前面取迭代器的时候，没有声明泛型的类型，后面就需要进行强转，原因就在于
        }

    }
}
