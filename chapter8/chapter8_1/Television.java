// 구현 클래스
/*
 구현 클래스는 보통의 클래스와 동일한데, 인터페이스 타입으로 사용할 수 있음을 알려주기 위해
 클래스 선언부에 implements 키워드를 추가하고 인터페이스 이름을 명시해야 합니다.
 그리고 인터페이스에 선언된 추상 메소드의 실체 메소드를 선언해야 합니다.
 */

 // RemoteControl에는 3개의 추상 메소드가 있기 때문에  Television과 Audio는 RemoteControl의 추상 메소드 들에 대한 실체 메소드를 가지고 있어야 합니다.
package chapter8.chapter8_1;

public class Television implements RemoteControl {
    // 필드
    private int volume;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
