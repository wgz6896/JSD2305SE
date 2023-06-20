package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileInputStream fis = new FileInputStream("demo.txt");
        byte[]data = new byte[(int)file.length()];
//        System.out.println(file.length());
        fis.read(data);
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();
    }
}
