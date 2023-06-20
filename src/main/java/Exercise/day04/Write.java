package Exercise.day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        for (int i = 97; i < 97+26 ; i++) {
            fos.write(i);
        }
        fos.close();
    }
}
