// 자동 타입 변환

package chapter2.chater2_3;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue; // byte -> int 자동 변환
        System.out.println("int value " + byteValue);

        char charValue ='가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue; // int -> long 자동 변환
        System.out.println("long value: " + longValue);

        longValue = 100;
        float floatValue = longValue; // long -> float 자동 변환
        System.out.println("float value: " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue; // float -> double 자동 변환
        System.out.println("double value: " + doubleValue);
    }
}