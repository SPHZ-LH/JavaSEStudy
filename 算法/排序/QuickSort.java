package 排序;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        long startTime = System.currentTimeMillis();
        
        getSun(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }

    public static void getSun(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start >= end) {
            return;
        }

        int breakArr = arr[i];

        while (start != end) {

            while (true) {
                if (end <= start || arr[end] < breakArr) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start || arr[start] > breakArr) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        getSun(arr, start + 1, j);
        getSun(arr, i, start - 1);
    }
}
