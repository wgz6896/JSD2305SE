package file;

import java.io.File;
import java.io.IOException;

public class DeleteDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("demo");
        if(dir.exists()){
            dir.delete();
            System.out.println("删除");
        }else {
            dir.createNewFile();
            System.out.println("创建成功");
        }
    }
}
