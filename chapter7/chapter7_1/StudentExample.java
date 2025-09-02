package chapter7.chapter7_1;

import chapter6.chapter6_1.Studnet;

public class StudentExample {
    public static void main(String[] args) {
        Student studnet = new Student("홍길동", "123456-1234567", 1);
        // 부모에게 상속받은 필드 출력
        System.out.println("name :" + studnet.name);
        System.out.println("ssn : " + studnet.ssn);
        System.out.println("studentNo: " + studnet.studentNo);
    }
}
