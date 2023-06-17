package wrapper;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 包装列提供的一些实用功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //包装类提供了两个常量，用来表示其对应的基本类型的取值范围
        //查看in的最大值与最小值
//        int i = 97;
//        int i1 = Integer.valueOf(i);
//        String s = String.valueOf(i1);
//        int i2 = Integer.parseInt(s);
//        System.out.println(i2);
//        System.out.println(s+1);
        String s2= "123.23";
        double d1 = Double.parseDouble(s2);
        System.out.println(d1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i2);
//        int imax = Integer.MAX_VALUE;
//        int imin = Integer.MIN_VALUE;
//        System.out.println(imax);
//        System.out.println(imin);
//        long lmax = Long.MAX_VALUE;
//        System.out.println(lmax);
    }
}
