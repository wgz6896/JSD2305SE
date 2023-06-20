package Exercise.day03;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List <Integer>c = new ArrayList();
//        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            c.add(new Random().nextInt(100));
        }
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);

        }
    }
