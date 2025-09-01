// 상수 선언


package chapter6.chapter6_5;

public class Earth {
    // 상수는 static 이면서 final 이여야 합니다.
    // static final 필드는 객체마다 존재하지 않고 클래스에만 존재합니다.
    // 한 번 초기값이 저장되면 변경할 수 없습니다.
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}
