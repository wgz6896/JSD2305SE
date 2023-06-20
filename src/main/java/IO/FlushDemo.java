package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "江杰爱洗脚,天天没烦恼 ";
        byte[]a = line.getBytes(StandardCharsets.UTF_8);
//        System.out.println(a);
        bos.write(a);
        bos.flush();
        System.out.println("ok");
        bos.close();
    }
}
