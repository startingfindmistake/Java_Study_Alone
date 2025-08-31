package chapter6.chapter6_5;

public class Vehicle {
    // 필드
    int speed;
    
    // 메소드
    void run() {
        System.out.println(speed + " 으로 달립니다.");
    }

    //인스턴스 필드와 인스턴스 메소드를 main()메소드에서 바로 사용할 수 없습니다.
    /* 
    public static void main(String[] args) {
        speed = 60;
        run();
    }

    */

    // 밑에 코드는 main()메소드를 올바르게 수정완료
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.speed = 60;
        myVehicle.run();
    }
}
