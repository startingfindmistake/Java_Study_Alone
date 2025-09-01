package chapter6.chapter6_6.package_different;

import chapter6.chapter6_6.C;

public class F {
     C c1 = new C(true);    //(0)
     C c2 = new C(1);       //(x)  <- default 생성자 접근 불가(컴파일 에러)
     C c3 = new C("문자열")   //(x)  <- private 생성자 접근 불가(컴파일 에러)
}
