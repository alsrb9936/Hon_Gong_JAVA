package sec02.exam09;

import java.util.Scanner;
public class LogicalOperatorExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int charCode;

        charCode = scanner.next().charAt(0);

        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자입니다.");
        } if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자입니다.");
        }

        int value;

        value = scanner.nextInt();

        if((value%2 == 0)|(value%3==0)){
            System.out.println("2 또는 3의 배수입니다");
        }
        else{
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }

    }
}
