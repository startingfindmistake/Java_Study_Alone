package chapter7.chapter7_2;

public class Child extends Parent {
    // 재정의
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}

