package string;

public class ReplaceAllDEMO {
    public static void main(String[] args) {
        String lin = "abc132der456ghi789";
       lin = lin.replaceAll("[a-zA-Z]+","#WORD#");
        System.out.println(lin);
        lin = lin.replaceAll("[a-zA-Z]","word");
        System.out.println(lin);
        String regex = "(wqn|dsb|nc|mlb|djb)";//词组括起来并且进行|操作
        String message = "wqn!你个dsb，你怎么这么的nc，你绝对是纯纯的djb";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
