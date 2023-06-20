package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class OISdemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 对象输入流，提供Object.readObject
         */
        FileInputStream fis = new FileInputStream("personDemo1.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        PersonDemo1 personDemo = (PersonDemo1) ois.readObject();
        System.out.println(personDemo);
        ois.close();

    }
}
