package sec01.exam03;

import java.awt.*;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("a: " + a + ", b:" + b);

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a: " + a + ", b:" + b);
    }
}
