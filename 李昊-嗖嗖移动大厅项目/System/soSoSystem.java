package System;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Entity.Consumlnfo;
import Entity.MobileCard;
import Util.CarUtil;

public class soSoSystem {
    public static void soSoSystem(HashMap<String, MobileCard> hashMap, HashMap<String, List<Consumlnfo>> ListConsumlnfo,
            String number) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("**************嗖嗖移动用户菜单**************");
            System.out.println("1:本月账单查询");
            System.out.println("2:套餐余量查询");
            System.out.println("3:打印消费详单");
            System.out.println("4:套餐变更");
            System.out.println("5:办理退网");
            System.out.println("请输入(1~5选择功能,其他键返回上一级):");
            int Num = sc.nextInt();
            switch (Num) {
                case 1 -> System.out.println(CarUtil.showAmountDetail(hashMap, number));
                case 2 -> System.out.println(CarUtil.remaining(hashMap, number));
                case 3 -> System.out.println(CarUtil.consume(ListConsumlnfo, number));
                case 4 -> CarUtil.alter(hashMap, number, sc);
                case 5 -> {
                    System.out.println(CarUtil.quit(hashMap, number));
                    return;
                }
                default -> {
                    System.out.println("返回上一级成功");
                    return;
                }
            }
        }
    }
}
