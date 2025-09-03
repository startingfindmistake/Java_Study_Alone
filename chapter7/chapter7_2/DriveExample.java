// Vehicle, Driver, Bus, Taxi 클래스를 이용해서 실행하는 DriverExample 클래스를 살펴보자
// 실행 클래스
package chapter7.chapter7_2;

public class DriveExample {
    public static void main(String[] args) {
        // 객체 생성
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // Driver 객체의 drive() 메소드를 호출할 때 Bus 객체와 Taxi 객체를 제공했습니다.
        // DriverExample의 Bus 객체의 run() 메소드 실행
        driver.drive(bus);  // 자동 타입 변환 : Vehicle vehicle = bus;
        driver.drive(taxi); // 자동 타입 변환 : Vehicle vehicle = taxi;
    }
}
