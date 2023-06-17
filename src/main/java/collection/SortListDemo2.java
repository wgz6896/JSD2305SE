package collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point>list = new ArrayList<>();
        Collection list1 = new ArrayList();
        list.add(new Point(3,7));
        list.add(new Point(4,5));
        list.add(new Point(34,42));
        list.add(new Point(7,71));
        list.add(new Point(32,77));
        System.out.println(list);
//        Comparator<Point>c = new Comparator<Point>(){
//            @Override
//            public int compare(Point o1, Point o2) {
//                int  olen1 = o1.getX()^2+ o1.getY()^2;
//                int  olen2 = o2.getX()^2+ o2.getY()^2;
//                return olen1-olen2;
//            }
//        };
//        Collections.sort(list, new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                return 0;
//            }
//        });
        Collections.sort(list, (o1,o2)-> (o1.getX()^2+ o1.getY()^2-o2.getX()^2+ o2.getY()^2));
        System.out.println(list);

    }
}