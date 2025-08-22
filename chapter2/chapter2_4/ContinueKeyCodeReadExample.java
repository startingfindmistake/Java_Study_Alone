// 입력된 키의 개수와 상관없이 키도드 일기
package chapter2.chapter2_4;

public class ContinueKeyCodeReadExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if(keyCode == 123) {
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
        // System.in.read()는 입력 버퍼에서 한 바이트를 읽습니다.
        // 키보드로부터 입력을 받으면 해당 키의 ASCII 코드값이 반환됩니다.
        // 예를 들어, 'A' 키를 누르면 65가 반환됩니다.
        // 만약 'Enter' 키를 누르면 10(줄바꿈)과 13(캐리지 리턴)이 반환됩니다.
        // 따라서, 입력된 키의 개수와 상관없이 계속해서 키코드를 읽어들이고 출력합니다.
        // 만약 입력된 키코드가 123(예: 'Enter' 키)이라면 반복문을 종료하고 프로그램을 종료합니다.
        // 이 예제는 키보드로부터 입력을 계속해서 읽어들이는 예제입니다.
        // 사용자가 'Enter' 키를 누르면 프로그램이 종료됩니다.
        // 입력된 키코드는 ASCII 코드값으로 출력됩니다.
        // 예를 들어, 'A' 키를 누르면 65가 출력되고
        // 'B' 키를 누르면 66이 출력됩니다.
    }
}
