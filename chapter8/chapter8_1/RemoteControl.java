// 상수 필드 선언
// 인터페이스는 데이터를 저장할 수 없기 때문에 상수 필드만 선언할 수 있습니다.
package chapter8.chapter8_1;

public interface RemoteControl {
    // 상수 필드 선언
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 인터페이스 호출된 메소드는 객체에서 실행되므로 추상 메소드로 선언합니다.
    // [public abstract] 리턴타입 메소드이름(매개변수, ...);

    //추상 메소드
    // 메소드 선언부만 작성
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
