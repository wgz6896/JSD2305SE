package homework.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 *
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        int old = list.set(2, list.get(5));
        list.set(5,old);
        System.out.println(list);
    }
}
