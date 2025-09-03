package chapter7.chapter7_3;

public class PhoneExample {
    public static void main(String[] args) {

        //Phone 생성자를 호출해서 객체를 생성할 수 없다
        //Phone phone = new Phone();

        // 대신 자식 클래스인 SmartPhone으로 객체를 생성해서 Phone의 메소드인 turnOn(), turnOff() 메소드를 사용가능
        SmartPhone smartPhone = new SmartPhone("홍길동");

        //Phone의 메소드
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
