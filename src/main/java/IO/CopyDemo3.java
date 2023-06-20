package IO;

/**
 * java将流分为两类:
 * 节点流与处理流
 * 节点流: 又称为低级流，特点: 实际连接程序与另一端的”管道"，负责实际读写数据的流
 * IO一定是建立在某个低级流的基础上进行的
 * 文件流就是低级流，它们是实际连接程序与文件的管道，负责读写文件数据
 * 处理流:又称为高级流，特点: 不能独立存在，必须连接在其他流（可以是高级流也可以是低级流）上，
 * 目的是当数据经过该流时对数据进行某种加工处理，
 * 简化我们的同等作实际开发中我们经常串联一组高级流最终到某个低级流上，
 * 式的读写数据的过程中以流水线式的操作对数据加工处理，这个过程也称为”流的连接"
 */
public class CopyDemo3 {
    public static void main(String[] args) {

    }
}
