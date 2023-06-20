package Exercise.day05;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("myDir");
        if(file.exists()){
            System.out.println("exist");
        }else{
            file.mkdirs();
            System.out.println("目录创建成功");
        }
        for (int i = 1; i <= 100; i++) {
            File file1 = new File("./myDir/demo"+i+".txt");
            if(file1.exists()){
                System.out.println("exist");
            }else{
                file1.createNewFile();
            }
        }

    }
}
