package apidoc;
/**
*文档注释。文档注释是功能级注释，用于说明类，方法，常量的作用
* 文档注释可以使用javadoc命令生成文档手册
* 在类上使用说明类的功能
* @author 吴广智     作者
* @version 1.0       版本
* @see  java.util.Scanner      参考（应当是与当前类密切相关的希望被关注的类）
* @since JDK1.0     始于（当前类使用了某个版本特性就要始于该版本作为最低运行版本）
*/
public class ApiDogDemo{
    public static void main(String[] args) {
        System.out.println("㔥");
    }
    /**
     *
     * @param name 给定的用户名
     * @return 返回相应的字符串
     */
    public String sayHello(String name){
        return INFO+ name;
    }

    /**
     * sayHello中使用的问候语
     */
    public static final String INFO = "你好";
}
