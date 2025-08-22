// 정수 리터럴
package chapter2;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수 리터럴
        int var2 = 0206; // 8진수 리터럴
        int var3 = 365; // 10진수 리터럴
        int var4 = 0xB3; // 16진수 리터럴

        System.out.println("var1 (2진수): " + var1);
        System.out.println("var2 (8진수): " + var2);
        System.out.println("var3 (10진수): " + var3);
        System.out.println("var4 (16진수): " + var4);
    }
}
