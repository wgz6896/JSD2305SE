package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

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
