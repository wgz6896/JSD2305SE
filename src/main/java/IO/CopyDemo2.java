package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写次数，可以提高效率
 * 一组字节一次性读写被称为：块读写操作
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./R-C.jpg");
        FileOutputStream fos = new FileOutputStream("./R-C2.jpg");
        byte[] a = new byte[10];//1kb
        int len ;
        long start = System.currentTimeMillis();
        while(((len = fis.read(a))!=-1)){
            fos.write(a,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fis.close();
        fos.close();
    }
}
