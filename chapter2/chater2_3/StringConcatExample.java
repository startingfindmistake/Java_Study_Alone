// 문자열 결합 연산
package chapter2.chater2_3;

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int value = 10 + 2+ 8;
        System.out.println("value: " + value); // 20

        // 문자열 결합 연산
        String str1 = 10 + 2 + "8"; // 숫자와 문자열 결합
        System.out.println("str1: " + str1); // 128

        String str2 = 10 + "2" + 8; // 문자열과 숫자 결합
        System.out.println("str2: " + str2); // 1028

        String str3 = "10" + 2 + 8; // 문자열과 숫자 결합
        System.out.println("str3: " + str3); // 1028

        String str4 = "10" + (2 + 8); // 문자열과 숫자 결합
        System.out.println("str4: " + str4); // 1028


    }
    
}
