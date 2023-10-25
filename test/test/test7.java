package test;

public class test7 {
    public static void main(String[] args) {
        int[] arr = { 12, 33, 22, 44, 66, 45, 36, 25, };
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
