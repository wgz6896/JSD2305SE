package exception;

/**
 * java异常处理机制tryl
 * 可能出现异常的代码片段trycatch(XXXException e){
 * 针对try中出现的XXXException所对应的补办法(B计划
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("action");
        String str  = null;
        System.out.println(str.length());
        System.out.println("end");
    }
}
