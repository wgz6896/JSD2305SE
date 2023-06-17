package Exercise.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("ont");
        list.add("two");
        list.add("three");
        System.out.println(list);
        String []arr =list.toArray(new String[list.size()]);//toArray可以通过对象调用，括号里面输入前面类型的new【集合长度】
        //但是即使没有输入正确的长度，会参考传入的集合自动改变长度
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }//不要再用循环进行数组的输出操作了
        System.out.println(Arrays.toString(arr));
        List<String> list1 =Arrays.asList(arr);//asList是一个静态方法，需要Arrays类进行调用
        //如果对这个集合进行操作的话，会导致对数组也会造成影响
        //所以这里不能对集合进行删改操作，如果需要就先对这个集合再新创建一个集合复制进去，对这个新集合进行操作
        System.out.println(list1);
        List<String>list2 = new ArrayList<>(list1);
        list2.add("giao");
        System.out.println(list2);
    }
}
