package IO;

import java.io.*;

public class CopyDemo {
    public static final int NUM = 10;
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("R-C.jpg");
        FileOutputStream fos = new FileOutputStream("R-C_cp.jpg");
        int d ;

        //获取当前系统时间（UTC时间）
        //返回的时自1970年1.1日0点至今的当前系统所经过的时间
        long start =  System.currentTimeMillis();
        while((d = fis.read())!=-1){
//            System.out.println(fis.read());
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        fis.close();
        fos.close();
//        File file = new File("R-C.jpg");
//        if (file.exists()) {
//            file.delete();
//            System.out.println("ok");
//        }
    }
}
