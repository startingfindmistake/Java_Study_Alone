// 변수의 사용 범위
// (일부러 오류 나는 코드)
package chpater1;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }
        int v3 = v1 + v2 + 5; // v2는 if 블록 내에서 선언되었으므로 여기서 접근할 수 없음
    }
}
