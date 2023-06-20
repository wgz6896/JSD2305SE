package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 实现一个简易的记事本工具程序启动后，
 * 将在控制台上输入的每一行字符串都陆续写入到文note.txt中
 * 当在控制台上单独输入"exit"时，程序退出。
 */

/**
 * 覆盖模式: 文件流实例化时如果发现指定的文件已经存在则会清空该文件原有数据然后才开始工作
 * 第二类:追加模式FileOutputStream(File file,boolean append)
 * FileOutputStream(String path,boolean append)如果第二个参数为true，则当前文件输出流为追加模式，
 * 即:文件流实例化时如果指定的文件已经存在，则原有内容全部保留，新写入的内容会陆续追加到文件中
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("请开始输入内容");
        File file = new File("./note.txt");
        FileOutputStream fos = new FileOutputStream("./note.txt",true);
//        FileInputStream fis = new FileInputStream("./note.txt");
        Scanner scanner = new Scanner(System.in);
        String things = "";
        byte[] data ;
        while (true) {
            things = scanner.nextLine();
            if ("exit".equals(things)) {
                break;
            }
            data = things.getBytes(StandardCharsets.UTF_8);
            fos.write(data);
        }
        fos.close();
    }
}
