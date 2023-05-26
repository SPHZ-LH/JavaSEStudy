package 作业;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        double result = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                result = result + arr[i];
                count++;
            }
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
        System.out.println("偶数的个数是" + count);
        if (count == 0) {
            System.out.println("偶数的平均值是" + result);
        } else {
            System.out.println("偶数的平均值是" + result / count);
        }
    }
}
