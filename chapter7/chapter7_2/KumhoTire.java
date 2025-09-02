package chapter7.chapter7_2;

public class KumhoTire extends Tire {
    // 필드

    // 생성자
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    // 다른 내용을 출력하기 위해 재정의한 roll() 메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " kumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " kumhoTire 펑크 ***");
            return false;
        }
    }
}
