package chapter7.chapter7_1;

// protected 접근 제한자

// protected는 public과 default 접근 제한의 중간쯤에 해당합니다.
// 같은 패키지에서는 default와 같이 접근 제한이 없지만 다른 패키지에서는 자식 클래스만 접근을 허용합니다.
public class A {
    protected String field;

    protected A() {
    }

    protected void method() {
    }
}
