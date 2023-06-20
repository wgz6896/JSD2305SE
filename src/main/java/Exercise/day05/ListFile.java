package Exercise.day05;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

//要获取指定目录下的文件名
public class ListFile {
    public static void main(String[] args) throws IOException {
        File file  = new File(".git");
        file.mkdirs();
        if(file.isDirectory()){
          File []subs = file.listFiles(new FileFilter() {
              @Override
              public boolean accept(File pathname) {
                  return pathname.getName().contains("s");
              }
          });
          for(File sub : subs){
              System.out.println(sub.getName());
          }
//            file1.createNewFile();
//            for(File sub : subs){
//                sub.delete();
//            }
        }
//        file.delete();
    }
}
