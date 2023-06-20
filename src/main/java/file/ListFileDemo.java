package file;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File file = new File(".");//表示当前目录
        /**
         * File提供了方法:
         * boolean isFile()判断当前File对象表示的是否为一个文件 I
         * boolean isDirectory()判断当前File对象表示的是否为一个日灵
         * listFiles列出当前FiLe对象表示的目录中的所有子项
         * 每一个子项以一个File对象表示，最终FiLe 数组形式将该目录中所有子项返回
         */
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for(File sub : subs)
            System.out.println(sub.getName());
        }
    }
}
