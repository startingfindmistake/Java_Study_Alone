// 정수 타입의 연산
// byte, short, int, long 타입의 정수는 서로 다른 크기를 가지며, 연산 시 자동으로 큰 타입으로 변환됩니다.
// 예를 들어, byte와 int를 더하면 결과는 int 타입이 됩니다.
// 따라서, byte와 int를 더한 결과를 long 타입 변수에 저장할 수 있습니다.
// 이 경우, byte와 int는 자동으로 long으로 변환되어 연산됩니다.
// 또한, byte와 int를 더한 결과를 int 타입 변수에 저장할 수 있지만, 이 경우 데이터 손실이 발생할 수 있습니다.
// 예를 들어, byte 값이 127이고 int 값이 1인 경우, 결과는 128이지만, byte 타입 변수에 저장하면 128이 초과되어 데이터 손실이 발생합니다.
// 따라서, 정수 타입의 연산 시에는 데이터 손실을 주의해야 합니다.
package chapter2.chater2_3;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3; // byte와 int는 자동으로 long으로 변환되어 연산됩니다.
        System.out.println("결과: " + result);
    }
}
