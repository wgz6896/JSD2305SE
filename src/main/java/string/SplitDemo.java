package string;

import java.util.Arrays;

/**
 * String中支持正则表达式的第二方法
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分，进行拆分，并将拆分后的结果以字符串数组返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String []data = line.split("[0-9]+");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));
        line = "a.b.c.d.";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));
//        line =
    }
}
