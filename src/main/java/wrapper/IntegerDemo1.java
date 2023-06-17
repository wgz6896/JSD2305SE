package wrapper;

/**
 * 包装类
 * java提供了8个包装类，分别对应8个类型
 * 包装类的出现是为了解决基本类型不能参与面向对象开发的问题，
 * 使得基本类型可以以对象的形式表达
 * 包装类的命名与基本类型名字一样，只有int和char不同
 *
 * int 包装类位Integer
 * char 包装类为 Character
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 123;
//        Integer integer = new Integer(i);
//        Integer integer1 = new Integer(i);
        Integer integer = Integer.valueOf(i);
        Integer integer1 = Integer.valueOf(i);
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer == integer1);//超过127就不对了，看源码
        System.out.println(integer.equals(integer1));
        int d = integer.intValue();
        double d1 = integer.doubleValue();
        System.out.println(d1);

//        double a = 123.23;
//        Double aDouble = Double.valueOf(a);
//        Double aDouble1 = Double.valueOf(a);
//        System.out.println(aDouble ==aDouble1);
//        char c = '男';
//        Character character = new Character(c);
//        Character character1 = new Character(c);
//        System.out.println(character ==character1);
//        System.out.println(character.equals(character1));
    }
}
