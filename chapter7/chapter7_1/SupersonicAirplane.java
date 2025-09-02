package chapter7.chapter7_1;

public class SupersonicAirplane extends Airplane {
    // 상수를 선언(자주 사용되는 고정값들은 상술르 사용함으로써 가독성을 높여줍니다.)
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행 합니다.");
        } else {
            // 부모인 Airplane의 fly()메소드를 호출한다.
            super.fly();        // Airplane 객체의 fly() 메소드 호출
        }
    }
}
