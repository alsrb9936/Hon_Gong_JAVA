package chap06.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        System.out.println("결과 값 1: " + myCom.sum1(new int[]{1, 2, 3}));
        System.out.println("결과 값 2: " + myCom.sum2(1, 2, 3));
        System.out.println("결과 값 3: " + myCom.sum2(1,2,3,4,5));

    }
}
