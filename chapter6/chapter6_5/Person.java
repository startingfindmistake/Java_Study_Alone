// final 필드 선언과 초기화

// final 필드 선언
// * final 타입 필드 [= 초기화];
// * final 필드는 저장된 초기값이 최종값이므로, 수정할수 없습니다.
package chapter6.chapter6_5;

public class Person {
    // nation은 항상 고정된 값을 갖기 때문에 필드 선언 시 초기값으로 "korea"를 주었습니다.
    final String nation = "korea";
    // ssn 필드는 한 번 값이 저장되면 변경할 수 없도록 final 필드로 선언했습니다.
    final String ssn;
    String name;

    // person 클래스의 생성자
    public Person(String ssn, String name) {
        // 생성자 매개값으로 ssn을 받아서 초기값으로 지정
        // 생성자를 통해 외부에서 전달받은 ssn 값을 이 객체의 ssn필드에 저장해라
        this.ssn = ssn;
        this.name = name;
    }
}
