package StringBuilder;

/**
 * StringBuilder是专门用于编辑字符串的工具类，其内部维护一个可变的char数组（没有final修饰）
 * 因此修改字符串内容时开销小，速度快，并且提供修改字符内容的相关方法（cude）
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //内部默认开辟16个字符长度的char数组
        StringBuilder builder = new StringBuilder();
        String line = builder.toString();
        String line2 = line;
        System.out.println(line ==line2);
        System.out.println(line.length());//现在应该时一个空串
        builder = new StringBuilder("好好学习java，好不好呢下            ");
        line = builder.toString();
        System.out.println(line.length());

    }
}
