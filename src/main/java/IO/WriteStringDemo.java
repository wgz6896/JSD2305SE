package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        String line = "江杰去洗脚，被打骨折，";
        byte []data =line.getBytes(StandardCharsets.UTF_8);//就可以转换成二进制
        fos.write(data);
        fos.write("还拉着张旭去，也被打骨折了".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}
