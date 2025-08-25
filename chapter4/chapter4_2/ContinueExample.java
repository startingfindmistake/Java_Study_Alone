//Continue를 사용한 for문
// Continue문은 블록 내부에서 continue문이 실행되면 for문의 증감식 또는
// while문, do-while문의 조건식으로 이동합니다.
// 즉, 반복문의 나머지 블록을 실행하지 않고 다음 반복을 수행합니다
package chapter4.chapter4_2;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i <=10; i++) {
            if(i%2 != 0) {
                continue; // i가 홀수이면 다음 반복으로 넘어감
            }
            System.out.println(i); // i가 짝수일 때만 출력
        }
    }
    
}
