// long 타입 변수
package chapter2;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L; // L 접미사를 사용하여 long 타입으로 지정
        // long var3 = 10000000000; 컴파일 에러
        long var4 = 10000000000L; // L 접미사를 사용하여 long 타입으로 지정

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
