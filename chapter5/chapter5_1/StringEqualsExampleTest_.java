package chapter5.chapter5_1;

public class StringEqualsExampleTest_ {
    public static void main(String[] args) {
        String name2 = "신민철";
        String name3 = new String("신민철");

        if(name2.equals(name3)) {
            System.out.println("name2와 name3의 문자열이 같음");
        } else {
            System.out.println("서로 다름");
        }
    }
}
