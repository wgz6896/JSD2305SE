package file;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        //需求: 在当前项目目录下新建一个名为: test.txt的文件./test.txt");
        File file = new File("./test.png");
        if(file.exists()){
            System.out.println("exit");
        }else{
            file.createNewFile();
        }
    }
}
