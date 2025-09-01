package chapter6.chapter6_6;    // 패키지 동일

public class field_Method_B {
    public field_Method_B() {
        field_Method_A a = new field_Method_A();
        // 필드 부분
        a.field1 = 1;   // public 접근 제한
        a.field2 = 1;   // default 접근 제한
        a.field3 = 1;   // private 필드 접근 불가(컴파일 에러)

        a.method1();    // public 접근 제한
        a.method2();    // default 접근 제한
        a.method3();    // private메소드 접근 불가(컴파일 에러)
    }
}
