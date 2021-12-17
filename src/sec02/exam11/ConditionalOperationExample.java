package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char grade = (score > 90) ? 'A' :((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다. ");
    }
}
