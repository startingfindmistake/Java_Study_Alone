package chapter7.chapter7_1;

public class SportsCar extends Car {
    @Override
    public void speedUp() { speed += 10; }


    // 재정의 할수 없다
    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
}
