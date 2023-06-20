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
        BufferedWriter bos =new BufferedWriter(osw);//
        PrintWriter pw = new PrintWriter(bos);
        String name ;
        while (true){
            name = scanner.nextLine();
            if("exit".equals(name)){
                break;
            }
            pw.println(name);
        }
        pw.close();
    }
}
