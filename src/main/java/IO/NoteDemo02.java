package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入");
        FileOutputStream fos = new FileOutputStream("note2.txt");//字节流
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//转换流，将字节转换成字符
        BufferedWriter bos =new BufferedWriter(osw);//对转换完的字符进行一个缓存
        PrintWriter pw = new PrintWriter(bos,true);//具有自动换行的高级流
        /**
         * PrintWriter的构造器:
         * 第一个参数是一个输出流，那么该构造器就支持再传入一个boolean类型的参数，
         * 表示是否开启自动行刷新功能。如果开启了自动行刷新功能，
         * 那么每当我们调用一次println方法时，就会自动flush一次
         */
        String name ;
        while (true){
            name = scanner.nextLine();
            if("exit".equals(name)){
                break;
            }
            pw.println(name);
//            pw.flush();
        }
        pw.close();
    }
}
