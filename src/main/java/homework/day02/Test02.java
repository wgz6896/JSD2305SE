package homework.day02;

import java.util.Arrays;

/**
 * 拆分字符串练习
 *
 * 背景介绍:
 * 上网的时候,浏览器地址栏上有没有留意类似如下的地址形式?
 * https://search.jd.com/Search?keyword=usb&enc=utf-8&wq=usb&pvid=2fb014e3597c4712828926e2f35fa2b5
 *
 * 上面这样的地址称为:URL(什么是URL可以百度一下~)
 *URL（Uniform Resource Locator，统一资源定位符）是互联网上用于定位和访问各种资源（
 * 如网页、图片、视频等）的地址，也是互联网的基础组件之一。
 * URL由若干部分组成，包括协议、主机名、端口号、路径和查询等，具体格式如下：
 * <协议>://<主机名>:<端口号>/<路径>?<查询>
 * 例如，一个URL地址可能长成这个样子：
 * https://example.com:8080/path/to/resource?query=a&query=b
 * 其中，https是协议，example.com是主机名，8080是端口号，/path/to/resource是资源路径，query=a&query=b是查询参数。
 * 通过URL，我们可以在浏览器中访问网页，也可以使用HTTP客户端访问网页或其他资源。URL是在互联网上进行信息交换的重要工具之一。
 * SE后期我们要写一个服务端,就要处理浏览器这样的请求.今天学习的字符串拆分方法在这里意义重大!
 *
 *
 * 单词记一记:
 * path   路径
 * age    年龄
 * local  本地的
 * host   计算机中译为:主机，服务机
 * nickname 昵称
 *
 * reg 是单词register的前三个字母，是注册的意思。
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan";
        /*
         * 将上述字符串按照"?"拆分为两部分并输出
         * ?左侧在控制台输出内容为:
         * 请求:http://localhost:8088/myweb/reg
         *
         * ?右侧在控制台输出内容为:
         * 参数:name=zhangsan
         *
         */
        String []str = path.split("\\?");
        System.out.println(Arrays.toString(str));





        /*
         * 进一步练习:
         */
        //           请求部分                                     ?                 参数部分
        path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        /*
         * 先拆分出请求部分与参数部分
         *
         * 观察参数部分的格式，找出规律后再将每一个参数的名字和值
         * 得到并输出为:
         * 参数名:name,参数值:zhangsan
         * 参数名:pwd,参数值:123456
         * ...
         */
        int index = path.indexOf("?")+1;
        String path1 = path.substring(index);
        String []str1 = path1.split("[\\&\\=]");
        System.out.println(Arrays.toString(str1));

    }
}





