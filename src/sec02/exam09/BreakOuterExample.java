package sec02.exam09;

public class BreakOuterExample {
    public static void main(String[] args) {
        Outer:
        for (int upper = 'A'; upper <= 'Z'; upper++) {
            for (int lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outer;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
