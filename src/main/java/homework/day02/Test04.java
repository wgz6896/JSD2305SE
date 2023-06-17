package homework.day02;
/**
 * 执行程序，分析并解决问题
 *
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,
 * 由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 *
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        /*
         * 原因:除了第一个字符可以是用来表示负值的 ASCII 减号 '-' ('\u002D') 外，字符串中的字符都必须是十进制数字。
         */
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);
        /*
         * 原因:将字符串参数作为有符号的十进制整数进行解析,只能返回整数类型，不能是小数
         */
        num = "123";
        d = Integer.parseInt(num);
        System.out.println(num);

        /*
         * 原因:不能使用中文分号结束
         */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);
    }
}
