// float과 double 타입
// float은 4바이트, double은 8바이트 크기의 실수 타입입니다.
// float은 소수점 이하 7자리까지, double은 소수점 이하 15자리까지 표현할 수 있습니다.
// 실수 리터럴은 기본적으로 double 타입으로 간주되므로, float 타입을 사용하려면 'f' 또는 'F' 접미사를 붙여야 합니다.
// 예를 들어, 3.14f는 float 타입의 실수 리터럴입니다.
// double 타입은 접미사를 붙이지 않아도 됩니다.
package chapter2;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 실수값 저장
        // float var1 = 3.14; // 컴파일 에러(Type mismatch: cannot convert from double to float)
        float var2 = 3.14f; // f 접미사를 사용하여 float 타입으로 지정
        double var3 = 3.14; // double 타입은 접미사가 없어도 됩니다.
        double var4 = 3.14d; // d 접미사를 사용하여 double 타입으로 지정

        // 정밀도 테스트
        float var5 = 0.1234567890123456789f; // float 타입의 정밀도
        double var6 = 0.1234567890123456789; // double 타입의 정밀도
        double var7 = 0.1234567890123456789d; // d 접미사를 사용하여 double 타입으로 지정

        System.out.println("var2 (float): " + var2);
        System.out.println("var3 (double): " + var3);
        System.out.println("var4 (double with d): " + var4);
        System.out.println("var5 (float precision): " + var5);
        System.out.println("var6 (double precision): " + var6);
        System.out.println("var7 (double with d precision): " + var7);

        //e 사용하기
        double var8 = 3e6; // 3 * 10^6
        double var9 = 3e6F; // 3 * 10^6, float 타입으로 지정
        double var10 = 2e-3; // 2 * 10^-3
        System.out.println("var8 (3e6): " + var8);
        System.out.println("var9 (3e6F): " + var9);
        System.out.println("var10 (2e-3): " + var10);
    }
}
