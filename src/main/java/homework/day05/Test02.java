package homework.day05;

import java.io.File;
import java.io.FileFilter;

/**
 * 列出当前目录中所有名字包含s的子项。
 * <p>
 * 使用匿名内部类和lambda两种写法
 * <p>
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 * @author Xiloer
 */
public class Test02 {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()) {
//            File []subs = file.listFiles(new FileFilter() {
//                @Override
//                public boolean accept(File pathname) {
//                    return pathname.getName().contains("s");
//                }
//            });
            File []subs = file.listFiles( pathname->pathname.getName().contains("s"));
            for (int i = 0; i < subs.length; i++) {
                String name = subs[i].getName();
                System.out.println(name);
            }
        }
    }
}
