package string;

/**
 * String 提供的一组静态方法valueOf
 * 作用是将其他类型转换为String
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 456123;
        String name = String.valueOf(a);
        System.out.println(name+1);
    }
}