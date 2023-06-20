package Exercise.day05;

import java.io.File;

public class DeteleDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if(file.exists()){
            file.delete();
            System.out.println("已经删除");
        }
    }
}
