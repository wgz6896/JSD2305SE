package homework.day01;

/**
 * 修改下面代码的错误
 * <p>
 * 下面代码完成的功能是输出字符串中的每一个字符
 *
 * @author Xiloer
 */
public class Test03 {
    //		string str = "hello world! i love java!";
//		for(int i = 0;i<=str.length;i++) {}
//			char c = i.charAt(i);
//			System.err.println(c);
    public static void main(String[] args) {
        String str = "hello world! i love java!";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);
        }
//        StringBuilder stringBuilder = new StringBuilder("hello world! i love java!");
//        System.out.println(stringBuilder.toString());
    }
}





