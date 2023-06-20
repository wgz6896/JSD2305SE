package homework.day05;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        if (file.isDirectory()) {
            File[] subs = file.listFiles(pathname-> pathname.isFile());
            //这里的意思是，对传入的文件进行判断其 内部是否为文件，然后对这个文件进行输出
            for (File sub : subs) {
                String name = sub.getName();
                String name1 = name.substring(0, name.lastIndexOf("."));
                //由于插入的文件名是在.前面，所以需要进行截取
                String name2 = name.substring(name.lastIndexOf(".")+1);
                String newName = name1 + "_cp"+name2;
                FileInputStream fis = new FileInputStream(sub);
                FileOutputStream fos = new FileOutputStream(newName);
                byte []data= new byte[1024*10];
                int len;
                while ((len = fis.read())!=-1){
                    fos.write(data,0,len);
                }
                fis.close();
                fos.close();
            }
        }
        System.out.println("ok");
    }
}


/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 * 这里要将原文件名拆开后想办法拼接_cp.
 */


