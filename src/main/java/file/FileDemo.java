package file;

import java.io.File;

/**
 * file:文件
 * io:input与output 即: 入与输出
 * java.io.File类File类的每一个实例用于表示硬盘上的一个文件或目录
 * (严谨的说法时表示作系统中文件系统里的一个文件或目录)，实际内部仅保存类一个路径
 * 使用File 可以:
 * 1: 访问其表示的文件或目灵的属性
 * 2: 创建或删除文件和目灵
 * 3: 访问一个目录中的子项
 * 但是File不能读写文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /**
         * 创建FiLe时指定想表示的文件或目灵的路径路径的格式:
         * 绝对路径: 从操作系统要求的根目录开始
         * 优点: 清晰明了，直观就能看出实际位置
         * 缺点:不利于跨平台
         *
         * 相对路径:常见的相对路径
         * 1:当前目录:"./"
         * 2:类加载路径(后期学习)3: 当前类在的目录(后期学习)
         * 优点:利于跨平台
         * 缺点:不清晰明了,具体位置要视程序的运行环境而定
         */
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\JSD2305SE\\demo.txt");
        File file1 = new File("./demo.txt");
        //返回文件的长度(占用磁盘空间的字节数)Tong Tength = file.length();
        long length = file1.length();
        System.out.println(length);
        boolean a = file.canRead();
        boolean b = file.canWrite();
        System.out.println(a+" "+b );
        boolean hidden = file.isHidden();
        System.out.println(hidden);
    }
}
