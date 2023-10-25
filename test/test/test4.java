package test;

public class test4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
