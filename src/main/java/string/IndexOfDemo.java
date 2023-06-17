package string;

/**
 * int indexOf(String str)
 * 检索给定字符串中的位置，如果当前字符串不含有指定内容则返回-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
                   // 0123456789012345,这里是对应thinking的字母的编号
        String str = "thinking a java";
//        int index = str.indexOf("in");
//        System.out.println(index);
//        index = str.indexOf("in",2);
//        System.out.println(index);
//        int index1 = str.indexOf("in",4);
//        System.out.println(index + " \n"+index1);
////      int index2 = str.lastIndexOf("a",9);
//        int index2 = str.lastIndexOf("in");
//        System.out.println(index2);
//        String name1 = "this is handsome";
//        int a = name1.indexOf("is",3);
//        System.out.println(a);
        String name = "this is an island";
        int index = name.indexOf("is");
        System.out.println(index);
        index = name.indexOf("is",4);
        System.out.println(index);
        int index1 = name.lastIndexOf("is");
        System.out.println(index1);
    }
}
