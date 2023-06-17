package StringBuilder;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("好好学习天天向上保护世界和平");
        builder.delete(4,7);
        System.out.println(builder);
    }
}
