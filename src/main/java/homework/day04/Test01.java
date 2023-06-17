package homework.day04;

import java.util.*;

/**
 * 在一个List集合中生成20个随机整数(100以内)Random
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 * 例如:
 * 1,2,3,4,5,15,14,13,12,11,10,9,8,7,6,16,17,18,19,20
 * @author pc
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        int i = list.set(2,6);
        System.out.println(list);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
        Collections.sort(list, (o1, o2) -> o1-o2);
        System.out.println(list);
        list.subList(5,15).sort((o1, o2) -> o2-o1);
        System.out.println(list);
    }
}








