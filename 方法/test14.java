package 方法;

import java.util.Random;

public class test14 {
    public static void main(String[] args) {
        int[] arr = { 2, 588, 888, 1000, 10000 };
        int[] newArr =new int [ arr.length ];
        for (int i = 0; i < newArr.length;) {
            Random r =new Random();
            int number =r.nextInt(newArr.length);
            int prize=arr[number];
            boolean flag= judgment(newArr,prize);
            if(flag==false){
                newArr[i] =prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
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