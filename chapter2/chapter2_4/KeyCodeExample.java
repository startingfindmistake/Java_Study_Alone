package chapter2.chapter2_4;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read(); // 키보드로부터 입력을 받음
        System.out.println("입력한 키코드: " + keyCode); // 입력한 키코드를 출력

        keyCode = System.in.read(); // 다시 키보드로부터 입력을 받음
        System.out.println("입력한 키코드: " + keyCode); // 입력한 키코드를 출력

        keyCode = System.in.read(); // 또 다시 키보드로부터 입력을 받음
        System.out.println("입력한 키코드: " + keyCode); // 입력한 키코드를 출력   
    }
}
