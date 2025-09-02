// 부모 생성자
package chapter7.chapter7_1;

public class People {
    public String name;
    public String ssn;

    // 기본 생성자는 없고 name과 ssn을 매개값으로 받아 객체를 생성시키는 생성자만 있다.
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
    // 그렇기 때문에 People을 상속하는 Student 클래스는 생성자에서 super(name, ssn)으로 People 클래스의 생성자를 호출해야 합니다.
}
