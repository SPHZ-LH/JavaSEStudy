package test;

import java.util.Random;

public class test10 {
    public static void main(String[] args) {
        int[] arr = { 2, 588, 888, 1000, 10000 };
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNum = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
