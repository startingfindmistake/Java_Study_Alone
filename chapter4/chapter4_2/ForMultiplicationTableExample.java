// 구구단 출력하기
package chapter4.chapter4_2;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++) {   //바깥쪽 for문
            System.out.println("*** " + m + "단 ***");
            for(int n=1; n<= 9; n++) {   // 중첩 for문
                System.out.println(m + " x " + n + " = " + (m*n));
            }
        }
    }
}

// 6라인의 바깥쪽 for문은 2단부터 9단까지 8번 반복합니다.
// 8라인의 안쪽 for문은 각 단마다 1부터 9까지 9번 반복합니다.
// 즉 m=2일때 n은 1~9까지 변하면서 2 x n = 2*n을 출력하게 됩니다
