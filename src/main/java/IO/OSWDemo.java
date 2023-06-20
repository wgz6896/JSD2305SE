package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * java将流按照读写单位划分为字节与字符流
 * java.io.InputStream和outputStream是所有字共输入流与输出流的超类
 * java.io.Reader和Writer是所有字符输入流与输出流的超类。
 * 字节流与字符流超类之间不存在继承关系
 * 字符流都是高级流，字符流是不能独立存在的，字符流以字符为单位进行读写。
 * 实际上本质底层最终还是要读写字节，但是字符流最终会将字符与字节之间进行转换(转换流进行)
 *
 * java.io.InputStreamReader天OutputStreamWriter
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //这里默认使用的系统提供的字符集，所以创建转换流时还要明确字符集，
        // （这样写出的字符都会按照该字符集转换为字节转出）避免跨平台出现的乱码
        osw.write("ahfuihaf\n");
        osw.write("abfi hia");
        System.out.println("ok");
        osw.close();
    }
}
