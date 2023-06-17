package homework.day01;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入用户名");
        String name = scanner.next().trim();
        int len = name.length();
        if(len >0&&len<=20){
            System.out.println("验证通过");
        }else
        {
            System.out.println("验证失败");
        }
    }

}
