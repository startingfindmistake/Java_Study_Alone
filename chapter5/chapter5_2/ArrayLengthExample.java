package chapter5.chapter5_2;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87 };
        int num = scores.length;
        System.out.println("socres배열 길이" + num);

        int sum =0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " +sum);

        double avg = (double) sum/ scores.length;
        System.out.println("평균 : " + avg);
    }
}
