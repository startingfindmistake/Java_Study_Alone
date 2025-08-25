// 1부터 100까지 합을 출력
//while문 내부에서 계속 누적되는 값을 갖는 루프 카운터 변수는 while문의 시작하기 전에 미리 선언해놓아야 합니다.
package chapter4.chapter4_2;

public class WhileSumFrom1To100Example {
     public static void main(String[] args) {
        int sum = 0;  // 합계를 저장할 변수
        int i = 1;    // 루프 카운터 변수

        while(i <= 100) {
            sum += i;  // sum = sum + i;
            i++;       // i = i + 1;
        }

        System.out.println("1~" + (i-1) + " 합: " + sum);
     }
}
