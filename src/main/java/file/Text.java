package file;

import java.io.File;
import java.io.IOException;

public class Text {
    public static void main(String[] args) throws IOException {
        File file = new File("./mkDir");
        if (file.exists()) {
            System.out.println("exit");
        } else {
            file.mkdirs();
            System.out.println("sucess");
            for (int i = 1; i <= 100; i++) {
                File file1 = new File(file, "/test" + i + ".txt");
                file1.createNewFile();
            }
        }
    }
}
