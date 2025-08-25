// break로 while문 종료하기
// break문은 자신이 포함된 가장 가까운 반복문을 종료시킵니다.

package chapter4.chapter4_2;

public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
