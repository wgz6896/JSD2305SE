package Exercise.day02;

import java.util.Arrays;

public class MatchDemo {
    public static void main(String[] args) {
        String email = "fan_cq@163.com.cn";
        String regex = "[0-9a-zA-Z_]+@[0-9]+(\\.[a-z]+)+";
//        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
//        boolean match = email.matches(regex);
//        System.out.println(match?"是邮箱":"不是邮箱");
        String[] regex1 = email.split("[0-9]");
        email = email.replaceAll("[0-9]+","NUMBER");
        System.out.println(email);
    }
}
