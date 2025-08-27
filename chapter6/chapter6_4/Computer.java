// 매개 변수의 개수를 모를 경우
package chapter6.chapter6_4;

public class Computer {
    // 매개 변수를 배열 타입으로 선언한다.
    int sum1(int[] values) { 
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    // 매개 변수를 배열을 타입으로 선언하면 메소드를 호출하기 전에 배열을 생성해야 하는 불편한 점이 있다.
    // 배열을 생성하지 않고 목록만 넘겨주는 방법
    // 매개 변수를 "..."을 사용해서 선언하게 되면 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
    int sum2(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    
}
