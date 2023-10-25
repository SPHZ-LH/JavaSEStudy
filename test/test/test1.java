package test;

public class test1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
