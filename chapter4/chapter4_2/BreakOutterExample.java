// 바깥문 반복문 종류
package chapter4.chapter4_2;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for(char upper= 'A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
