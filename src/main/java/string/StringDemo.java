package string;

/**
 * 字符串常量池
 * java建议我们使用字面量形式创建字符串，并且会重用对象
 * 凡是使用字面量创建的字符串都会被缓存在常量池中
 * 当我们再次使用相同字面量创建字符串会重用对方
 */
public class StringDemo {
    public static void main(String[] args) {

        String s1 = "123abc";
        String s4 = "123";
        String s5 = s4+"abc";
//        System.out.println(s5 == s4);
        String s2 = "123"+"abc";
        s2 = "2134";
        int len = s2.length();
        System.out.println(len);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        String s3 = new String("123abc");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));

    }
}
