package IO;

import java.io.*;

/**
 * 将当前io包下所有的类的内容部输出到控制台上问题
 * 1: 如何知道io包下有多少个java 文件?
 * 2: 读取读取java 文件的每一行内容并输出到控制台?
 */
public class Test {
    public static void main(String[] args)throws IOException {
        File file = new File("./src/main/java/IO");
        File[] subs = file.listFiles(s -> s.getName().contains(".java"));
        int i = 0;
        for (File sub : subs) {
            i++;
            FileInputStream fis = new FileInputStream("sub                                                      ");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String name ;
            while((name = br.readLine())!=null){
                System.out.println(name);
            }
        }
        System.out.println("总共有" + i + "个文件");

    }
}
