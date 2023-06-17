package collection;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        String[]arr = c.toArray(new String[c.size()]);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
