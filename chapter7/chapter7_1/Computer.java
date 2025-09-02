// 자식 클래스
package chapter7.chapter7_1;

public class Computer {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
