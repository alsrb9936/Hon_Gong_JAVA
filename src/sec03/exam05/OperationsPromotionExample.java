package sec03.exam05;

import javax.sound.midi.SysexMessage;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteResult = byteValue1 + byteValue2; <- 컴파일 에러 정수형은 int 오토캐스팅
        int intResult1 = byteValue1 + byteValue2;
        System.out.println(intResult1);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charResult = charValue1 + charValue2; <- 컴파일 에러 마찬가지로 int 오토캐스팅
        int intResult2 = charValue1 + charValue2;
        System.out.println("유니코드: " + intResult2);
        System.out.println("출력문자: " + (char)intResult2);

        int intValue1 = 10;
        int intResult3 = intValue1/4;
        System.out.println(intResult3);

        int intValue2 = 10;
        // int intValue2 = 10 / 4.0; <-컴파일 에러 double 오토캐스팅
        double doubleResult = intValue2 / 4.0;
        System.out.println(doubleResult);

        int a = 1;
        int b = 2;
        double doubleResult2 = (double) a / b;
        System.out.println(doubleResult2);
    }
}
