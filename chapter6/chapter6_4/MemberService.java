package chapter6.chapter6_4;

public class MemberService {
    // login()메소드를 호출할 때에는 매개값으로 id와 password를 제공하고
    // 리턴타입; boolean, 메소드 이름 : login,  매개변수(타입): id(String), password(String))
    boolean login(String id, String password) {
        // login() 메소드는 매개값 id가 "hong", 매개값 pawword "12345"일 경우에 ture로 리턴
        if(id.equals("hong") && password.equals("12345")) {
            return true;
            // 그 이외일 경우에는 false를 리턴합니다.
        } else {
            return false;
        }
    }

    // logout()메소드는 id만 매개값으로 제공합니다.
    // 리턴타입: void , 메소드 이름: logout, 매개변수(타입)
    void logout(String id) {
        // logout()메소드의 내용은 "로그아웃 되었습니다"가 출력되도록 하세요.
        System.out.println("로그아웃 되었습니다.");
    }    
}
