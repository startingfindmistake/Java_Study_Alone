// Getter와 Setter 메소드 선언
package chapter6.chapter6_6;

public class Car {
    // 필드
    private int speed; // private 접근 제한
    private boolean stop;   // private 접근 제한


    // 생성자

    // 메소드

    // Getter
    // 필드의 값을 외부로 리턴해주는 메소드
    public int getSpeed() {
        return speed;
    }

    // Setter
    // 외부에서 값을 받아 필드를 변경하는 메소드
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    //----------------------------------

    // Getter
    public boolean isStop() {
        return stop;
    }

    //setter
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
