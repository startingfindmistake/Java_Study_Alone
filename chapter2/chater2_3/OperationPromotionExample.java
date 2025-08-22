// 연산식에서 자동 타입 변환
package chapter2.chater2_3;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2; // 컴파일 에러
        int intValue = byteValue1 + byteValue2; // byte는 int로 자동 변환되어 연산됩니다.
        System.out.println("byte 값의 합: " + intValue);

        char charValue1 = 'A';
        char charValue2 = 1;
        // char charValue3 = charValue1 + charValue2; // 컴파일 에러
        int intValue2 = charValue1 + charValue2; // char는 int로 자동 변환
        System.out.println("문자 'A'와 1의 합의 유니코드= " + intValue2);
        System.out.println("문자 'A'와 1의 합의 출력문자= " + (char) intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4; // int는 int로 나누어도 결과는 int
        System.out.println("10을 4로 나눈 결과: " + intValue4);

        int intValue5 = 10;
        // int intValue6 = 10 / 4.0; // 컴파일 에러
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue); // int는 double로 자동 변환되어 연산됩니다.

        int x = 1;
        int y = 2;
        double result = x / y; // int는 double로 자동 변환되지 않습니다.
        System.out.println("1 / 2의 결과: " + result); // 결과는 0.0입니다.
    }
}
