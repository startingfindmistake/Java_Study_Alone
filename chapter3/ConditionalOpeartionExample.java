package chapter3;

public class ConditionalOpeartionExample {

    public static void main(String[] args) {
        int score = 85;
        char grade = (socre > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
    
}
