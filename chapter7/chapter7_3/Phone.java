// 추상 클래스

package chapter7.chapter7_3;
// 추상 클래스 선언할 때에는 클래스 선언에 abstract 키워드를 붙여야 합니다.
// abstract를 붙이면 new 연산자를 이용해서 객체를 만들지 못하고, 상속을 통해 자식 클래스만 만들 수 있습니다.
public abstract class Phone {
    // 필드
    public String owner;

    // 생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    // 메소드
    public void turnOn() {
        System.out.println(" 폰 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
