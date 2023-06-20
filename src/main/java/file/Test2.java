package file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("mkDir");
        if(file.isDirectory()){
            File []subFile = file.listFiles();
            for (File sub : subFile){
                System.out.println(sub.getName());
                sub.delete();
            }
        }
            file.delete();
            System.out.println("文件已经删除");
    }
}
