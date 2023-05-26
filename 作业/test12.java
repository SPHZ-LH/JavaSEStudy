package 作业;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[5];
        System.out.println("请输入5个数：");
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < data.length; i++) {
            try {
                int result = 100 % data[i];
                System.out.println("余数结果是" + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
