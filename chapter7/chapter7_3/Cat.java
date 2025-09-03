// 추상 메소드 재정의
// 추상 클래스인 Animal을 상속하고, 추상 메소드인 sound()를 재정의
package chapter7.chapter7_3;

public class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }

    // 추상 메소드 재정의
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
