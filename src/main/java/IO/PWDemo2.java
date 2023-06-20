package IO;

import javafx.scene.layout.BorderWidths;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //文件流(低级流)，作用: 向文件中写入字节(2进制数据)
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        //转换流(高级流)，作用:1：衔接字节流与字符流2:写出的字转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符流(高级流)，作用:内部有一个默认8K的char数组，以块写文本数据来保证写出效率
        BufferedWriter bw = new BufferedWriter(osw);
        //PW(高级流)，作用:1: 按行写出字符串 2: 自动行刷新
        PrintWriter pw = new PrintWriter(bw);
        pw.println("江杰洗脚洗的，");
        pw.println("一gi我滴giaogiao");
        System.out.println("ok");
        pw.close();

    }
}
