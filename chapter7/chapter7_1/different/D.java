// protected 접근 제한자 테스트
package chapter7.chapter7_1.different;  // A클래스와 다른 패키지

import chapter7.chapter7_1.A;

// A의 자식 클래스
public class D  extends A {
    public D() {
        // 접근 가능
        super();
        this.field = "value";
        this.method();
    }
}
