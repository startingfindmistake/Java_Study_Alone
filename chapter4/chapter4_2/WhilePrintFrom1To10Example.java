//1부터 10까지 출력
// while 문은 조건식이 true인 동안 계속 반복합니다.
package chapter4.chapter4_2;

public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        int i = 1; // 루프 카운터 변수
        while( i<= 10) {
            System.out.println(i);
            i++;  // i = i + 1;
        }
    }
}
