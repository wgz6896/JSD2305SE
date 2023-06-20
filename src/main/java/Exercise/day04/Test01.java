package Exercise.day04;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
class A{
    private String name;
    A(){name = "wu";}
    public void show(){
        System.out.println(name);
    }
}