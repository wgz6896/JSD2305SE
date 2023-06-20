package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 有条件的获取一个目灵中的子项
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        File file = new File(".");
        if(file.isDirectory()){
            FileFilter filter = (File pathname)->pathname.getName().contains("e");
            File[]subs = file.listFiles(filter);
            System.out.println("共有"+ subs.length);
            for(File sub :subs){
                System.out.println(sub);
            }
        }
    }
}
