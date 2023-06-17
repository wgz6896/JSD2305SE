package string;

/**
 * String subtring(int start,int end)
 * 截取当前字符串从下表start到end之间的内容
 * 注意在API中有一个特定：如果用两个数字表示范围的话，通常都是含头不含尾
 */
public class SubStingDemo {
    public static void main(String[] args) {
//        String str = "www.baidu.com";
//        String str1 = "https://www.douyin.com";
//        String getStr = str.substring(4,9);
//        System.out.println(getStr);
        String str = "http://www.douyin.com";
        String str1 = str.substring(4,9);
        System.out.println(str1);

    }
}
