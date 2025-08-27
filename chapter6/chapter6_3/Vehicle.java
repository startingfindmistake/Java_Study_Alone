// 다른 생성자를 호출해서 중복 코드 줄이기
package chapter6.chapter6_3;

public class Vehicle {
    //필드
    String company = "기아자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Vehicle() {
    }

    Vehicle(String model) {
        this(model, "은색", 250);
    }
    Vehicle(String model, String color) {
        this(model, color, 250);
    }

    Vehicle(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
