package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        String line = "江杰去洗脚，被打骨折，";
        byte []data =line.getBytes(StandardCharsets.UTF_8);//就可以转换成二进制
        fos.write(line.getBytes());
/**
 * flush方法是接口:Flushable中唯一的抽象方法而输出流的超类实现了该接口，
 * 这意味着java中所有的输出流都具有该方法，而除了缓冲流的FLush是真正用于清空缓冲区的效果外，
 * 其他高级流上的FLush方法实现是统一的，就是调用它链接的流的FLush方法，将该动作传递下去，
 * 最终传递给缓冲输出流做实际的fLush动作
 */
        fos.write("还拉着张旭去，也被打骨折了".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}
