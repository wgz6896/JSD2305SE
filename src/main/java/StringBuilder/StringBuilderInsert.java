package StringBuilder;

public class StringBuilderInsert {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder("好好学习天天向上");
//        builder.insert(0,"hhasd");//也时默认强转为字符串
//        System.out.println(builder);
        StringBuilder name = new StringBuilder("好好学习,天天向上");

        System.out.println(name);
        name.insert(4,"保护世界和平");
        System.out.println(name);
    }
}
