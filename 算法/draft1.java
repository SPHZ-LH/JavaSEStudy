import java.util.Arrays;

public class draft1 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 8, 9, 4, 5, 6, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        StringBuilder st1 =new StringBuilder();
        int[] arr2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
