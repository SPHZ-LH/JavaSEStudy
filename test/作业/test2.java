package 作业;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i + 1));
            result = result + arr[i];
        }
        System.out.println(result);
    }
}
