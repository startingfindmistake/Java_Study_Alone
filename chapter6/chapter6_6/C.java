package chapter6.chapter6_6;

// C클래스 내부에서 C의 모든 생성자를 호출할 수 있다.
public class C {
    // 필드
    C c1 = new C(true);
    C c2 = new C(1);
    C c3 = new C("문자열");

    // 생성자
    public C(boolean d) {}  //<- public 접근 제한
    C(int d) {} //<- default 접근 제한
    private C(String s) {}  // <- private 접근 제한
    
}
