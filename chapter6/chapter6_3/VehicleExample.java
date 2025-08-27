package chapter6.chapter6_3;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Vehicle1.company : " + vehicle1.company);
        System.out.println();

        Vehicle vehicle2 = new Vehicle("자가용");
        System.out.println("vehicle2.company : " + vehicle2.company);
        System.out.println("vehicle2.model : " + vehicle2.model);
        System.out.println();

        Vehicle vehicle3 = new Vehicle("자가용", "빨강");
        System.out.println("vehicle3.company : " + vehicle3.company);
        System.out.println("vehicle3.model: " + vehicle3.model);
        System.out.println("vehicle3.color : " + vehicle3.color);
        System.out.println();

        Vehicle vehicle4 = new Vehicle("택시", "검정", 200);
        System.out.println("vehicle4.company : " + vehicle4.company);
        System.out.println("vehicle4.model : " + vehicle4.model);
        System.out.println("vehicle4.color :" + vehicle4.color);
        System.out.println("vehicle4.maxSpeed :" + vehicle4.maxSpeed);

    }
}
