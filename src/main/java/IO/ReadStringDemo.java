package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileInputStream fis = new FileInputStream("demo.txt");
        byte[]data = new byte[(int)file.length()];//1010101010,用10代表这个文件的长度
//        System.out.println(file.length());
        fis.read(data);//以文件长度为速度，一下子就读文件
        String line = new String(data, StandardCharsets.UTF_8);//用string内的方法进行对这个1010形式的字节长度数组数据转换为字符串类型，并且进行赋值
        System.out.println(line);
        fis.close();
    }
}
