package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 转换流(最常用的字符流，但是实际开发中我们不会直接作这对流，但是在流链接中是重要的一环)
 * java.io.InputStreamReader和OutputStreamWriter
 * 由于字符流不能直接连在字节流上，此时转换流是唯一一对可以连接在字节流上的字符流，
 * 使用它就可以将字节流与字符流串联在一起进行操作了。起到了"转换器"的作用，因此它得名为转换流并且转换流从类名上就能看出:
 * OutputStreamWriter 为例
 * 其中OutputStream是所有字节输出流的超类
 * Writer是所有字符流的超类
 * 它用两个超类组合命名，就是表达可以将字节流转换为字符流
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("bos.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d ;//在字符流默认读一个字符，字节流是读1个字节.
//        System.out.println(d);
        /**
         * 字符输入流读取字符的操作
         * int read()
         * 读取并返回一个字符，返回的int值实际上是一个char。但是如果返回值为整数-1表达流读取到了末尾
         */
//        int a = isr.read();
//        System.out.println(a);
        //也即是说，read读的是这个字符的对应的码值，需要进行强转，转换回字符输出
        while((d = isr.read())!=-1){
        System.out.print((char)d);}
        isr.close();
    }
}
