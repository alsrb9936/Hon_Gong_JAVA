package sec01.exam05;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        switch(num){
            case 1:
                System.out.println("1번을 뽑았습니다");
                break;
            case 2:
                System.out.println("2번을 뽑았습니다");
                break;
            case 3:
                System.out.println("3번을 뽑았습니다");
                break;
            case 4:
                System.out.println("4번을 뽑았습니다");
                break;
            case 5:
                System.out.println("5번을 뽑았습니다");
                break;
            default:
                System.out.println("6번을 뽑았습니다");
                break;
        }
    }
}
