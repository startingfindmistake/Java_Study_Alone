// float 타입 카운터 변수
// 0.1 ~ 1.0 까지 0.1씩 증가
package chapter4.chapter4_2;

public class ForFloatCounterEcample {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
    
}

//  이론적으로 7라인의 for문은 10번 반복해야 합니다.
// 하지만 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 루프 카운터 변수 x에 더해시는 실제 값은
// 0.1보다 약간 큽니다.
// 결국 루프는 9번만 실행됩니다.
