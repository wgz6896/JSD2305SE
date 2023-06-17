package string;

/**
 * 得到域名
 */
public class Exercise {
    public static void main(String[] args) {
        String s1 = "www.tarena.com.cn";
        String s2 = "http://www.tedu.cn";
        String name1 = getHostName(s1);
        String name2 = getHostName(s2);
        System.out.println(name1);
        System.out.println(name2);
    }
    //思路：截取url中第一个.到第二个.的字符串返回
    public static String getHostName(String url){
        int index = url.indexOf(".")+1;
        System.out.println(index);
        int index1 = url.indexOf(".",index+1);
        //这里会从fromindex这一位也算进去开始判断是否相等
        String str = url.substring(index,index1);
        return str;
    }
}
