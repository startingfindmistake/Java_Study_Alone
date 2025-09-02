// protected 접근 제한자 테스트
package chapter7.chapter7_1.different; // A클래스와 다른 패키지

import chapter7.chapter7_1.A;

public class C {
    public void method() {
        // 접근 불가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
