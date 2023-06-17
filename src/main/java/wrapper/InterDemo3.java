package wrapper;

/**
 * 自动拆装箱特性（编译器特性）
 * 允许我们将基本类型与对应的包装类之间直接进行互相赋值
 */
public class InterDemo3 {
    public static void main(String[] args) {
        //自动装箱特性，编译器自动改为：Integer in = new Integer(213);
        Integer in = 213;
        System.out.println(in);
        //触发自动拆箱特性，编译器会将代码改为：int i = in.inValue();
        int i = in;
        Double d1 = 123.123;
        double d2 = d1;
        System.out.println(d1);
    }
}
