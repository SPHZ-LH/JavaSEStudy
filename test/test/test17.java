package test;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前机票价钱");
        int jiaQian = sc.nextInt();
        System.out.println("请输入当前月份");
        int yueFen = sc.nextInt();
        System.out.println("请输入舱位0头等舱1经济舱");
        int cangWei = sc.nextInt();
        if (yueFen >= 5 && yueFen <= 10) {
            if (cangWei == 0) {
                double number = jiaQian * 0.9;
                System.out.println(number);
            } else {
                double number = jiaQian * 0.85;
                System.out.println(number);
            }
        } else {
            if (cangWei == 1) {
                double number = jiaQian * 0.7;
                System.out.println(number);
            } else {
                double number = jiaQian * 0.65;
                System.out.println(number);
            }
        }
    }
}
