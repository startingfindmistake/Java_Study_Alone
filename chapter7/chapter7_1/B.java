// protected 접근 제한자 테스트
package chapter7.chapter7_1; //A클래스와 동일한 패키지

public class B {
    public void method() {
        // 접근 가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
