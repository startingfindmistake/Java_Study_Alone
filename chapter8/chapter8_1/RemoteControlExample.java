package chapter8.chapter8_1;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        // 인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 합니다.
        // 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입될 경우 구현 객체의 번지를 저장합니다.
        /*
         * 인터페이스 변수;
         * 변수 = 구현객체;
         */
        rc = new Television();
        rc = new Audio();
    }
}
