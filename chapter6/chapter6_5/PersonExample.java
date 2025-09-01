// final 필드 테스트
package chapter6.chapter6_5;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");


        // println=> 출력 + 자동줄바꿈
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "634321-7654321";
        p1.name ="홍삼원";
    }
}
