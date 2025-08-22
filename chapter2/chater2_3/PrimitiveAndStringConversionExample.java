// 기본 타입과 문자여 간의 변환
package chapter2.chater2_3;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args){
        int value = Integer.parseInt("10"); // 문자열을 정수로 변환
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true"); // 문자열을 불리언으로 변환

        System.out.println("value1: " + value); // 10
        System.out.println("value2: " + value2); // 3.14
        System.out.println("value3: " + value3); // true

        String str1 = String.valueOf(10); // 정수를 문자열로 변환
        String str2 = String.valueOf(3.14); // 실수를 문자열로 변환
        String str3 = String.valueOf(true); // 불리언을 문자열로 변환

        System.out.println("str1: " + str1); // "10"
        System.out.println("str2: " + str2); // "3.14"
        System.out.println("str3: " + str3); // "true"
    }
    
}
