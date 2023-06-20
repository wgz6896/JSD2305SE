package IO;

import java.io.Serializable;
import java.util.Arrays;

public class PersonDemo1 implements Serializable {//签名接口Serializable，你可序列化
    private transient String name;
    private int age;
    private char gender;
    private transient String[] otherInfo;

    public PersonDemo1(String name, int age, char gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "PersonDemo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
