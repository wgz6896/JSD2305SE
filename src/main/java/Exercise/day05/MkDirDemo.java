package Exercise.day05;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File file = new File("demo/a/b/c");
        if (file.exists()) {
            System.out.println("exist");
        }else {
            file.mkdirs();
            System.out.println("目录一创建");
        }
    }
}
