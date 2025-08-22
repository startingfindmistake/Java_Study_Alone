// 강제 타입 변환
// 작은 타입에서 큰 타입으로는 자동으로 변환되지만, 큰 타입에서 작은 타입으로는 강제 변환이 필요합니다.
// 예를 들어, double 타입을 int 타입으로 변환하려면 명시적으로 캐스팅을 해야 합니다.
// 캐스팅은 (타입) 변수를 사용하여 수행합니다.
// 예: int intValue = (int) doubleValue;
// 이 경우 소수점 이하의 값은 버려집니다.
// 따라서, 강제 변환을 사용할 때는 데이터 손실이 발생할 수 있습니다.
package chapter2.chater2_3;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032; // 유니코드 값
        char charValue = (char) intValue; // int -> char 강제 변환
        System.out.println("유니코드 44032의 문자: " + charValue);
    

    long longValue = 500;
    intValue = (int) longValue;
    System.out.println(intValue);

    double doubleValue = 3.14;
    intValue = (int) doubleValue;
    System.out.println("double 3.14를 int로 변환: " + intValue);
    }
}
