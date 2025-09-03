// 자식 클래스
// Bus와 Taxi클래스는 Vehicle 클래스를 상속받아 run() 메소드를 재정의하고 있다.
package chapter7.chapter7_2;

public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
