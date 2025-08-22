// printf() 메소드 사용 방법
package chapter2.chapter2_4;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value); // %d는 정수형을 나타내는 포맷 지정자입니다.
        System.out.printf("상품의 가격: %6d원\n", value); // %6d는 최소 6자리로 출력하되, 부족한 자리는 공백으로 채웁니다.
        System.out.printf("상품의 가격: %-6d원\n", value); // %-6d는 최소 6자리로 출력하되, 왼쪽 정렬합니다.
        System.out.printf("상품의 가격: %06d원\n", value); // %06d는 최소 6자리로 출력하되, 부족한 자리는 0으로 채웁니다.

        double area = 3.14159 * 10 * 10; // 원의 넓이 계산
        System.out.printf("원의 넓이: %10.2f\n", area); // %f는 실수형을 나타내는 포맷 지정자입니다.
        
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job); // %s는 문자열을 나타내는 포맷 지정자입니다.
    }
    
}
