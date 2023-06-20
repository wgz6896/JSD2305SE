package IO;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPSize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectInputStream与ObjectOutputStream对象流是一对高级流，
 * 作用是进行对象序列化与反序列化
 * input反序列化，，output序列化
 * 对象序列化: 将一个java对转换为一组可用于保存或网络传输的字节的过程
 */
public class OOSDEmo {
    public static void main(String[] args) throws IOException {
        char gender = '女';
        String[] otherInfo = {"爱洗脚", "某处黑", "洗脚不给钱"};
        /**
         *
         * 对象输出流的独有方法
         * 对象输出流的独有方法:
         * void writeObject(Object obj)是用于进行对象序列化的，它会将给定的对象转换为一组字节
         * 然后通过其链接的流将数据写出但是该方法要求，写出的对象所属的类必须实现接口:java.io.Serializable，
         * 否则序列化时会抛出下列异常
         java.io.NotSerializableException
         */
        PersonDemo1 personDemo1 = new PersonDemo1("江杰", 18, gender, otherInfo);
        FileOutputStream fos = new FileOutputStream("personDemo1.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(personDemo1);
        System.out.println("ok");
        oos.close();
    }
}
