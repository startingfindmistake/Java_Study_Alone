// 재정의할 수 없는 fianl 메소드
package chapter7.chapter7_1;

// public final 리턴타입 메소드( [매개변수, ...] ) { ... }
// 메소드 선언 시 final 키워드를 붙이면 최종적인 메소드가 되어 재정의할 수 없습니다.
public class Car {
    //필드
    public int speed;

    // 메소드
    public void speedUp() { speed += 1}

    // final 메소드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
