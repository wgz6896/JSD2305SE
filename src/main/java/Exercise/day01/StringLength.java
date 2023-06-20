package Exercise.day01;

import java.util.Locale;

public class StringLength {
    public static void main(String[] args) {
        String html = "www.tedu.com.cn";
        String html1 = "www.baiDu.com";
        html1 = html1.toLowerCase();
//        System.out.println(html);
        int index = html.indexOf(".")+1;
        String i1 = String.valueOf(index);
        System.out.println(i1);
        int lastIndex = html.indexOf(".",index);
        System.out.println(html.charAt(3));
        String a =html.substring(index,lastIndex);
//        System.out.println(a);
        String name = "12354";
        int i = Integer.parseInt(name);
        System.out.println(i);


    }
}
