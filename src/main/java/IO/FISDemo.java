package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("fos.dat");
        int b = a.read();
        System.out.println(b);
        b = a.read();
        System.out.println(b);
        a.close();
    }
}
