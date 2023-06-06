package 方法;

import java.util.Random;

public class test16 {
    public static void main(String[] args) {
        int[] intPut = prizeNumber();
        for (int i = 0; i < intPut.length; i++) {
            System.out.print(intPut[i] + " ");
        }
    }

    private static int[] prizeNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int rednumber = r.nextInt(33) + 1;
            boolean flag = judgment(arr, rednumber);
            if (flag == false) {
                arr[i] = rednumber;
                i++;
            }
        }
        int bluenumber = r.nextInt(16) + 1;
        arr[6] = bluenumber;
        return arr;
    }

    public static boolean judgment(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
