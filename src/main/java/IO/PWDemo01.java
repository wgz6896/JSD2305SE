package IO;

import java.io.FileNotFoundException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class PWDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pw.txt");
       pw.println("江杰和我走一走");
        pw.println("哦呜哦呜哦呜");
        System.out.println("ok");
        pw.close();
    }
}
