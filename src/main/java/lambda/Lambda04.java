package lambda;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Vector;

public class Lambda04 {
    public static void main(String[] args) throws IOException {
//        FileFilter filter = f->f.getName().endsWith("txt");
        File file = new File(".");
        File file1 = new File("./name.txt");
        if(file1.exists()){
            System.out.println("exist");
        }else{
            file1.createNewFile();
        }
        File[] subs = file.listFiles();
        if (file.isDirectory()) {
            for (File sub : subs) {
                System.out.println(sub.getName());
            }
        }

        subs = file.listFiles( pathname->pathname.getName().endsWith(".txt"));
        for (File sub : subs) {
            System.out.println(sub.getName());
        }
    }
}