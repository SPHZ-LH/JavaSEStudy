package 方法;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入当前机票价钱");
        double jiaQian = sc.nextInt();
        System.out.println("请输入当前月份");
        int yueFen =sc.nextInt();
        System.out.println("请输入舱位0头等舱1经济舱");
        int cangWei =sc.nextInt();
        System.out.println("优惠后机票价钱为"+getNumber(jiaQian, yueFen, cangWei));
    }
    
    
    
    
    public static double getNumber(double jiaQian, int yueFen, int cangWei) {
        if (yueFen >= 5 && yueFen <= 10) {
            if (cangWei == 0) {
                 jiaQian = jiaQian * 0.9;

            } else {
                 jiaQian = jiaQian * 0.85;

            }
        } else {
            if (cangWei == 1) {
                 jiaQian = jiaQian * 0.7;

            } else {
                 jiaQian = jiaQian * 0.65;
            }
        }
        return jiaQian;
    }
}
