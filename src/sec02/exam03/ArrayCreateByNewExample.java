package sec02.exam03;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        view(arr1);
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        view(arr1);

        double[] arr2 = new double[3];
        view(arr2);
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        view(arr2);

        String[] arr3 = new String[3];
        view(arr3);
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        view(arr3);
    }

    public static void view(int[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void view(double[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void view(String[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
