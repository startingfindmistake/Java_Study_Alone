// 강제 타입 변환
package chapter7.chapter7_2;

public class ChildExample1 {
    public static void main(String[] args) {
        Parent1 parent1 = new Child1();        // <- 자동 타입 변환
        parent1.field1 = "data1";
        parent1.method1();
        parent1.method2();

        /* 불가능
        parent.field2 = "data2";
        parent.method3();
         */

        Child1 child1 = (Child1) parent1;       // <- 강제 타입 변환
        child1.field2 = "yyy";
        child1.method3();
    }
}
