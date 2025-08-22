// 키보드에서 입렫된 내용을 문자열로 얻기
// Scanner 클래스를 사용하여 키보드 입력을 처리하는 예제
// Scanner 클래스를 사용하면 키보드로부터 입력된 내용을 쉽게 읽어올 수 있습니다.
// 이 예제에서는 Scanner 클래스를 사용하여 문자열을 입력받고 출력하는 방법을 보여줍니다.
package chapter2.chapter2_4;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import


public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        String inputData;


        while(true) {
            inputData = scanner.nextLine(); // 키보드로부터 문자열 입력 받기
            System.out.println("입력한 문자열: \"" + inputData + "\""); // 입력한 문자열
            if(inputData.equals("q")) {
                break; // 입력한 문자열이 "q"이면 반복문 종료
            }
        }

        System.out.println("프로그램을 종료합니다."); // 프로그램 종료 메시지 출력
    }
}
