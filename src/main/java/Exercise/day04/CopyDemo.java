package Exercise.day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制一张图片
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 因为你要复制一个文件，你把这个文件当成大量的1010字节文件，
         * 所以对于文件的复制就是通过，将文件的所有字节数进行复制，
         * 先对文件进行读操作，然后对一个新的文件进行写操作，那就是需要IOStream
         */
        FileInputStream fis  =new FileInputStream("1.jpg");
        FileOutputStream fos = new FileOutputStream("3.jpg");
        byte[]data = new byte[888];
        long start = System.currentTimeMillis();
        int len;
        while ((len= fis.read())!=-1){
        fos.write(len);}
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //首先进行一个读数据,但是这样只能一个一个读，效率慢而且需要考虑全部字节，应该思考循环
        //也就是需要有一个循环条件，read读到末尾回返回一个-1，也就是判断这个read == -1
//        int d ;
//        while((d=fis.read())!=-1){
//            fos.write(d);
//        }
        fis.close();
        fos.close();

    }
}
