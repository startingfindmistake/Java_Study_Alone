package chapter7.chapter7_3;

public class AnimalExample {
    public static void main(String[] args) {
        // 가장 일반적인 방식으로 Dog와 Cat 변수로 호출했습니다.
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        // 2. Animal 변수로 타입 변환해서 sound() 메소드를 호출했습니다
        // 자식은 부모 타입으로 자동 타입 변환이 될 수 있고, 메소드가 재정의되어 있을 경우
        // 재정의된  자식 메소드가 호출되는 다형성의 특징이 그대로 적용됩니다.
        // 변수의 자동 타입 변환
        Animal animal = null;
        // 자동 타입 변환 및 재정의된 메소드 호출
        animal = new Dog();
        animal.sound();
        
        // 자동 타입 변환 및 재정의된 메소드 호출
        animal = new Cat();
        animal.sound();
        System.out.println("-----");


        // 3.부모 타입의 매개 변수에 자식 객체를 대입해서 메소드의 다형성을 적용
        // 두번째와 같은 원리로 자식 객체가 부모 타입으로 자동  타입 변환되어 재정의된 sound() 메소드가 호출됩니다.
        //메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();     // 재 정의된 메소드 호출
    }
}
