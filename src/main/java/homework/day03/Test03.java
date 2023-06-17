package homework.day03;

import java.util.*;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *不重复，就需要HaSet
 */
public class Test03 {
    public static void main(String[] args) {
        Collection<Integer> list = new HashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {//需要将生成的随机数存入list中
            list.add(random.nextInt(100));
        }
        //进行遍历输出
        Iterator<Integer>iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
