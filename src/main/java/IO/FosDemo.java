package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输入是从外界到程序中的方向，是我们程序用于获取外界信息的过程，是"读”的过程
 * 输出是从程序到外界的方法，是我们程序向外界发送信息的过程，是"写”的过程
 * 文件流
 * java.io.FileInputStream和FileOutputStream
 * 这两个流就继承白InputStream和OutputStream
 * 这两个流是用于连接我们程序和文件之间的管道，读写文件数据(读写硬盘)
 */
public class FosDemo {
    public static void main(String[] args) throws IOException {
        /**
         * FileOutPutStream(String path)//路径
         * FileOutPutStream(File file)//名称
         *
         */
//        File file = new File("./fos.dat");//使用这个方法就不需要进行抛异常
//        FileOutputStream fos = new FileOutputStream(file);
        /**
         * 文件输出流常用的构造器
         * FileOutputStream(String path)FileOutputStream(File file)
         * 文件流创建时如果指定的文件不存在会将其自动创建出来，前提是该文件所在的目录必须存在，
         * 否则会抛出异常:java.io.FileNotFoundException:系统找不到指定的路径
         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");
/**
 * 文件输出流继承OutputStream后就重了write方法，作用相同，
 * 就是将给定的int值对应2进制的“低八位"写入到文件中
 * 例如fos.write(int i )write都是一个字节，i的范围时int的最大MAX_VALUE
 */
        fos.write(1);
        fos.write(12);
        System.out.println( "写完了");
        fos.close();//当不再需要写出数据时，最后要将流关闭来释放资源
    }
}
