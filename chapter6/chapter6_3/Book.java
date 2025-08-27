/*
 * Java 문법 문제: this()를 활용한 생성자 오버로딩
문제: Book 클래스를 모델링하여 도서 객체를 생성하는 코드를 작성해 보세요. this()를 사용하여 생성자 내부에서 다른 생성자를 호출함으로써, 코드의 중복을 제거하고 효율성을 높이는 것이 이 문제의 핵심입니다. ✒️

요구사항
Book 클래스를 정의하세요.

String title (제목)

String author (저자)

int price (가격)

위 세 가지를 인스턴스 변수로 선언합니다.

다음 3개의 생성자를 this()를 이용하여 구현하세요.

기본 생성자 Book(): 호출 시, 제목은 "이것이 자바다", 저자는 "신용권", 가격은 30000으로 초기화되어야 합니다.

Book(String title, String author): 제목과 저자만 매개변수로 받고, 가격은 35000으로 초기화되어야 합니다.

Book(String title, String author, int price): 제목, 저자, 가격을 모두 매개변수로 받아 인스턴스 변수를 초기화하는 핵심 생성자입니다. 다른 생성자들은 궁극적으로 이 생성자를 호출해야 합니다.

showInfo() 메소드를 만드세요.

"제목: [제목], 저자: [저자], 가격: [가격]원" 형식으로 도서 정보를 출력합니다.

main 메소드에서 각 생성자를 사용하여 3개의 Book 객체를 생성하고, 각 객체의 showInfo() 메소드를 호출하여 결과를 확인하세요.

실행 결과 예시
제목: 이것이 자바다, 저자: 신용권, 가격: 30000원
제목: Do it! 점프 투 파이썬, 저자: 박응용, 가격: 35000원
제목: 클린코드, 저자: 로버트 C. 마틴, 가격: 45000원
 */

package chapter6.chapter6_3;

public class Book {
    // 인스턴스 변수 선언
    String title;   //제목
    String author;  //저자
    int price;   //가격


    // 기본 생성자: 매개변수가 없는 경우
    public Book() {
        // 3개의 매개변수를 받는 생성자를 호출하여 기본값 전달
        this("이것은 자바다", "신용권", 30000);
    }

    // 2. 제목과 저자만 받고 가격은 새로 초기화
    public Book(String title, String author) {
        // 3개의 매개변수르 받는 생성자 호출
        this(title, author, 35000);
    }

    // 3. 모든 정보를 받는 핵심 생성자
    public Book(String title, String author, int price) {
        // this()는 반드시 생성자의 첫 줄에 와야 합니다.
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 가격: " + this.price);
    }

    public static void main(String[] args) {
        // 각 생성자를 사용하여 객체 생성
        Book book1 = new Book();
        Book book2 = new Book("Do it! 점프 투 파이썬", "박응용");
        Book book3 = new Book("클린코드", "로버트 C. 마틴", 45000);


        // 정보 출력
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
    }
}
