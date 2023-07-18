import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 0, 9, 3, 7, 4, 8, 9, 0, 3, 4, 5, 7 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
