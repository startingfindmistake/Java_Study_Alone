// 인터페이스 변수에 구현 객체 대입
package chapter8.chapter8_1;


// SmartTelevision 객체를 RemoteControl 타입 변수와 Searchable 타입 변수에 각각 대입할 수 있습니다.
public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
    }
}
