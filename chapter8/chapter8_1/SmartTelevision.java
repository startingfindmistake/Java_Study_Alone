// 다중 인터페이스 구현 클래스
package chapter8.chapter8_1;

// SmartTelevision 클래스는 RemoteControl과 Searchable 인터페이스를 모두 구현하고 있다.
public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;

    // RemoteControl의 추상 메소드에 대한 실체 메소드
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    // Searchable의 추상 메소드에 대한 실체 메소드
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
