package System;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Entity.Consumlnfo;
import Entity.MobileCard;
import Package.ServicePackage;
import Util.CarUtil;

public class UserSystem {

    public static void UserSystem() throws Exception {
        HashMap<String, MobileCard> hm = new HashMap<>();
        HashMap<String, List<Consumlnfo>> consumlnfos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("***********欢迎使用移动嗖嗖业务大厅***********");
            System.out.println("1:用户登入");
            System.out.println("2:用户注册");
            System.out.println("3:使用嗖嗖");
            System.out.println("4:话费充值");
            System.out.println("5:资费说明");
            System.out.println("6:退出系统");
            System.out.println("请输入选项");
            String Num = sc.next();
            switch (Num) {
                case "1" -> addUser(hm, consumlnfos);
                case "2" -> enrUser(hm);
                case "3" -> useSOSO(hm, consumlnfos);
                case "4" -> recharge(hm);
                case "5" -> Inquire();
                case "6" -> {
                    System.out.println("退出成功");
                    break loop;
                }
            }
        }
    }

    // 用户登入
    public static void addUser(HashMap<String, MobileCard> hashMap, HashMap<String, List<Consumlnfo>> ListConsumlnfo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String putPhone = sc.next();
        if (contains(hashMap, putPhone)) {
            // 如果存在
            System.out.println("请输入密码");
            String putPassword = sc.next();
            String passWord = hashMap.get(putPhone).getPassWord();
            if (passWord.equals(putPassword)) {
                System.out.println("用户登入成功");
                soSoSystem.soSoSystem(hashMap, ListConsumlnfo, putPhone);
                return;
            } else {
                System.out.println("手机号或密码错误请重新登入");
                return;
            }
        } else {
            // 如果不存在?
            System.out.println("手机号未注册,请先注册");
            return;
        }
    }

    // 用户注册
    public static void enrUser(HashMap<String, MobileCard> hashMap) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        phoneCreation(list);// 手机号生成
        System.out.println("请选择手机号");
        String putPhone = phoneChoose(list, sc);// 手机号选择
        System.out.println("------------");
        if (contains(hashMap, putPhone)) {
            // 如果存在
            System.out.println("该手机号已注册，请重兴输入");
        } else {
            // 如果不存在
            ServicePackage packageCase = CarUtil.packageCase(sc);// 套餐选择
            System.out.print("请输入姓名:");
            String name = sc.next();
            System.out.print("请输入密码:");
            String putPassWord = sc.next();
            System.out.print("请输入预存的话费金额:");
            double price = packageCase.getPrice();// 套餐费用
            while (true) {
                int money = sc.nextInt();
                double result = money - price;
                if (result >= 0) {
                    MobileCard mobileCard = new MobileCard(result, putPhone, name, putPassWord, packageCase);
                    mobileCard.setConsumAmount(price);
                    hashMap.put(putPhone, mobileCard);
                    System.out.println("注册成功!卡号为：" + putPhone + " 用户名：" + name + " 当前余额为：" + result);
                    mobileCard.getSerPackage().showlnfo();
                    break;
                } else {
                    System.out.print("您预存的话费金额不足以支付本月固定套餐资费，请重新充入");
                }
            }
        }
    }

    // 手机号选择
    public static String phoneChoose(ArrayList<String> list, Scanner sc) {
        int Num = sc.nextInt();
        String s = null;
        switch (Num) {
            case 1 -> s = list.get(0);
            case 2 -> s = list.get(1);
            case 3 -> s = list.get(2);
            case 4 -> s = list.get(3);
            case 5 -> s = list.get(4);
            case 6 -> s = list.get(5);
            case 7 -> s = list.get(6);
            case 8 -> s = list.get(7);
            case 9 -> s = list.get(8);
        }
        return s;
    }

    // 手机号生成
    public static void phoneCreation(ArrayList<String> list) {
        Random r = new Random();
        for (int i = 1; i < 10; i++) {
            String result = "139";
            for (int j = 0; j < 8; j++) {
                result = result + r.nextInt(10);
            }
            list.add(result);
            System.out.print(i + "." + result + "\t");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

    // 使用嗖嗖
    public static void useSOSO(HashMap<String, MobileCard> hashMap, HashMap<String, List<Consumlnfo>> ListConsumlnfo)
            throws Exception {
        CarUtil.randomEntry(hashMap, ListConsumlnfo);
    }

    // 话费充值
    public static void recharge(HashMap<String, MobileCard> hashMap) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入充值的卡号：");
        String number = sc.next();
        if (hashMap.containsKey(number)) {
            MobileCard mobileCard = hashMap.get(number);
            double money = mobileCard.getMoney();
            System.out.print("请输入充值的金额：");
            int putMoney = sc.nextInt();
            double result = money + putMoney;
            mobileCard.setMoney(result);
            System.out.println("话费充值，当前话费余额为" + result + "元");
        } else {
            System.out.println("该手机号未注册，请重新输入");
        }

    }

    // 资费说明
    public static void Inquire() {
        System.out.println("*******************资费说明******************");
        System.out.println("套餐类型：话痨套餐");
        System.out.println("通话时长：200分钟");
        System.out.println("短信条数：50条");
        System.out.println("月资费：58元");
        System.out.println("--------------------------------------------");
        System.out.println("套餐类型：网虫套餐");
        System.out.println("上网流量：5GB");
        System.out.println("月资费：68元");
        System.out.println("--------------------------------------------");
        System.out.println("套餐类型：超人套餐");
        System.out.println("通话时长：200分钟");
        System.out.println("短信条数：100条");
        System.out.println("上网流量：1GB");
        System.out.println("月资费：78元");
        System.out.println("--------------------------------------------");
        System.out.println("超出套餐计算：");
        System.out.println("通话时长：0.2元/分钟");
        System.out.println("短信条数：0.1元/分钟");
        System.out.println("上网流量：0.1元/分钟");
    }

    // 查询手机号是否存在
    public static boolean contains(HashMap<String, MobileCard> hashMap, String putPhone) {
        boolean containsKey = hashMap.containsKey(putPhone);
        if (containsKey) {
            return true;
        } else {
            return false;
        }
    }
}
