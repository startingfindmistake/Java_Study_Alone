package chapter6.chapter6_6.package_different;  //패키지가 다름

import chapter6.chapter6_6.*;

public class field_Method_C {
    public field_Method_C() {
        field_Method_A a = new field_Method_A();
        a.field1 = 1;   // public 접근 제한
        a.field2 = 1;   // default 필드 접근 불가(컴파일 에러)
        a.field3 = 1;   // private 필드 접근 불가(컴파일 에러)

        a.method1();    // public 메소드 접근 제한 가능
        a.method2();    // default 메소드 접근 불가(컴파일 에러)
        a.method3();    // private 메소드 접근 불가(컴파일 에러)
    }
}
