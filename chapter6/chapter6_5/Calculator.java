// 정적 멤버 사용
// 객체마다 가지고 있어야 할 데이터라면 인스턴스 필드로 선언하고,
// 객체마다 가지고 있을 필요가 없는 공용 데이터라면 정적 필드로 선언하는 것이 좋습니다.
package chapter6.chapter6_5;

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
