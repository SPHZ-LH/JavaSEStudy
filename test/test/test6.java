package test;

import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            System.out.print(arr[i] + " ");
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i];
        }
        System.out.println(num);
        double ping = (double) num / arr.length;
        System.out.println(ping);
        int tongji = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ping) {
                tongji++;
            }
        }
        System.out.println(tongji);
    }
}
