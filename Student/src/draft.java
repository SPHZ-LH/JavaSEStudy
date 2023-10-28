import java.util.Scanner;

public class draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int[] arr = new int[sc.nextInt()];
        arr[0] = number1;
        arr[1] = number2;
        int count = 2;
        for (int i = 0, j = i + 1; i < arr.length; i++) {
            int Num = arr[i] * arr[j];
            if (Num > 9) {
                String s = String.valueOf(Num);
                int len = s.length();
                char[] chars = s.toCharArray();
                count += len;
            }
            if (count == 10) {
                break;
            }
        }
    }
}
