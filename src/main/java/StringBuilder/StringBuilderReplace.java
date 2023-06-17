package StringBuilder;

public class StringBuilderReplace {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("好好学习,天天向上");
        builder.replace(4,15,"保护世界和平");
        System.out.println(builder);
        String line = builder.toString();
        System.out.println(line.length());
    }
}
