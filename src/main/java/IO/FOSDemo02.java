package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream a = new FileOutputStream("./a.txt");
//        a.write(97);

        for (int i = 0; i < 26; i++) {
            a.write(97+i);
        }
    }
}
