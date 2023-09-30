import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        int[] arr = input();
        int max = getmax(arr);
        int min = getmin(arr);
        int num = getresult(arr);
        int result =num-min-max;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(result/4);
    }

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入分数");
            int number = sc.nextInt();
            if (number >= 0 && number <= 100) {
                arr[i] = number;
                i++;
            } else {
                System.out.println("请重新输入");
            }
        }
        return arr;
    }

    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getresult(int [] arr){
        int num =0;
        for (int i = 0; i < arr.length; i++) {
             num =num +arr[i];
        }
        return num;
    }
}
