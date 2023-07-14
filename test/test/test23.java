package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个0~100的整数");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num < 0 || num > 100) {
                System.out.println("输入的数不符合要求，请重兴输入");
                continue;
            }
            list.add(num);
            int result = getSun(list);
            if (result > 200) {
                System.out.println("已经超过200");
                System.out.println(result);
                break;
            }
        }
    }

    private static int getSun(ArrayList<Integer> list) {
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            num = num + list.get(i);
        }
        return num;
    }
}
