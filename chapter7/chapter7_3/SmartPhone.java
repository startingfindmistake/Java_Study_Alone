// 실체 클래스
// Phone 추상 클래스를 상속해서 SmartPhoen 자식 클래스를 정의한 것
package chapter7.chapter7_3;

public class SmartPhone extends Phone {
    // 생성자
    public SmartPhone(String owner) {
        super(owner);   // Phone의 생성자를 호출하고 있다.
    }
    // 메소드
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
