package Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Entity.Consumlnfo;
import Entity.MobileCard;
import Entity.Scene;
import Package.NetPackage;
import Package.ServicePackage;
import Package.SuperPackage;
import Package.TalkPackage;

public class CarUtil {
    // 测试类没有属性，创建对象没有意义
    private CarUtil() {
    }

    // 套餐选择
    public static ServicePackage packageCase(Scanner sc) {
        System.out.print("1.话痨套餐\t");
        System.out.print("2.网虫套餐\t");
        System.out.print("3.超人套餐\t");
        System.out.print("请选择套餐(输入序号):");
        ServicePackage servicePackage = null;
        switch (sc.nextInt()) {
            case 1 -> servicePackage = new TalkPackage(58, 500, 30);
            case 2 -> servicePackage = new NetPackage(68, 3 * 1024);
            case 3 -> servicePackage = new SuperPackage(78, 200, 1 * 1024, 50);
        }
        return servicePackage;
    }

    // 消费场景
    public static HashMap<Integer, Scene> environment() {
        HashMap<Integer, Scene> hm = new HashMap<>();
        Scene s1 = new Scene("通话", 90, "问候客户，谁知其如此难缠，通话90分钟");
        Scene s4 = new Scene("短信", 50, "通知朋友手机换号，发送50条短信");
        Scene s3 = new Scene("短信", 5, "参与环境保护实施方案问卷调查，发送短信5条");
        Scene s2 = new Scene("通话", 100, "和亲爱的女朋友煲电话粥，通话100分钟");
        Scene s5 = new Scene("上网", 350, "看了一部电影，消耗350MB流量");
        Scene s6 = new Scene("上网", 120, "打了一个小时游戏，消耗120MB流量");
        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);
        hm.put(4, s4);
        hm.put(5, s5);
        hm.put(6, s6);
        return hm;
    }

    // 录入手机号，进入场景
    public static void randomEntry(HashMap<String, MobileCard> hashMap, HashMap<String, List<Consumlnfo>> consumlnfos)
            throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String number = sc.next();
        ArrayList<Consumlnfo> list = new ArrayList<>();
        if (hashMap.containsKey(number)) {
            Random r = new Random();
            int count = r.nextInt(6) + 1;
            HashMap<Integer, Scene> environment = environment();
            Scene scene = environment.get(count);// 场景对象
            System.out.println(scene.getDescription());// 消费场景
            String type = scene.getType();// 使用类型
            int data = scene.getData();// 使用数据
            MobileCard mobileCard = hashMap.get(number);
            ServicePackage serPackage = mobileCard.getSerPackage();// 判断套餐类型
            if (serPackage instanceof NetPackage) { // 只能上网
                if (type.equals("上网")) {// 使用类型为上网
                    NetPackage netPackage = (NetPackage) serPackage;// 强转为网虫套餐
                    try {
                        int netPlay = netPackage.netPlay(data, mobileCard);// 更改手机卡内的数据
                        list.add(new Consumlnfo(number, type, netPlay));// 添加进消费记录
                        consumlnfos.put(number, list);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {// 使用类型为其他
                    System.out.println("该手机套餐不支持该项服务，请重新输入");
                }
            } else if (serPackage instanceof TalkPackage) { // 可以通话，短信
                if (type.equals("通话")) {
                    TalkPackage talkPackage = (TalkPackage) serPackage;
                    try {
                        int call = talkPackage.call(data, mobileCard);
                        list.add(new Consumlnfo(number, type, call));// 添加进消费记录
                        consumlnfos.put(number, list);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (type.equals("短信")) {
                    TalkPackage talkPackage = (TalkPackage) serPackage;
                    try {
                        int send = talkPackage.send(data, mobileCard);
                        list.add(new Consumlnfo(number, type, send));// 添加进消费记录
                        consumlnfos.put(number, list);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("该手机套餐不支持该项服务，请重新输入");
                }
            } else { // 都可以
                SuperPackage superPackage = (SuperPackage) serPackage;
                if (type.equals("上网")) {// 使用类型为上网
                    try {
                        int netPlay = superPackage.netPlay(data, mobileCard);// 更改手机卡内的数据
                        list.add(new Consumlnfo(number, type, netPlay));// 添加进消费记录
                        consumlnfos.put(number, list);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (type.equals("通话")) {
                    try {
                        int call = superPackage.call(data, mobileCard);
                        list.add(new Consumlnfo(number, type, call));// 添加进消费记录
                        consumlnfos.put(number, list);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    try {
                        int send = superPackage.send(data, mobileCard);
                        list.add(new Consumlnfo(number, type, send));// 添加进消费记录
                        consumlnfos.put(number, list);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } else {
            System.out.println("改手机号未注册，请重新输入");
        }
    }

    // 账单查询
    public static String showAmountDetail(HashMap<String, MobileCard> hashMap, String number) {
        StringBuilder sb = new StringBuilder();
        MobileCard mobileCard = hashMap.get(number);
        double price = mobileCard.getSerPackage().getPrice();// 套餐资费
        double consumAmount = mobileCard.getConsumAmount();// 消费金额
        double money = mobileCard.getMoney();// 余额
        sb.append("**************嗖嗖移动用户菜单**************\n");
        sb.append("您的卡号：" + number + "，当月账单：\n");
        sb.append("套餐资费：" + String.format("%.1f", price) + "元\n");
        sb.append("合计：" + String.format("%.1f", consumAmount) + "元\n");
        sb.append("账户余额：" + String.format("%.1f", money) + "元\n");
        return sb.toString();
    }

    // 套餐剩余查询
    public static String remaining(HashMap<String, MobileCard> hashMap, String number) {
        StringBuilder sb = new StringBuilder();
        MobileCard mobileCard = hashMap.get(number);
        int realTalkTime = mobileCard.getRealTalkTime();
        int realSMSCount = mobileCard.getRealSMSCount();
        int realFlow = mobileCard.getRealFlow();
        ServicePackage serPackage = mobileCard.getSerPackage();
        int resultTime = 0;
        int resultsmsCount = 0;
        int resultFlow = 0;
        sb.append("***************套餐余量查询***************\n");
        sb.append("您的卡号是" + number + "，套餐内剩余\n");
        if (serPackage instanceof TalkPackage) {
            TalkPackage talkPackage = (TalkPackage) serPackage;
            int talkTime = talkPackage.getTalkTime();
            int smsCount = talkPackage.getSmsCount();
            resultTime = talkTime - realTalkTime;
            resultsmsCount = smsCount - realSMSCount;
            if (resultTime > 0) {
                sb.append("通话时长：" + resultTime + "分钟\n");
            } else {
                sb.append("通话时长：" + 0 + "分钟\n");
            }

            if (resultsmsCount > 0) {
                sb.append("短信条数：" + resultsmsCount + "条\n");
            } else {
                sb.append("短信条数：" + 0 + "条\n");
            }

            sb.append("上网流量：" + 0 + "GB\n");
            return sb.toString();
        } else if (serPackage instanceof NetPackage) {
            NetPackage netPackage = (NetPackage) serPackage;
            int flow = netPackage.getFlow();
            resultFlow = flow - realFlow;
            sb.append("通话时长：" + 0 + "分钟\n");
            sb.append("短信条数：" + 0 + "条\n");
            if (resultFlow > 0) {
                sb.append("上网流量：" + resultFlow / 1024 + "GB\n");
            } else {
                sb.append("上网流量：" + 0 + "GB\n");
            }

            return sb.toString();
        } else {
            SuperPackage superPackage = (SuperPackage) serPackage;
            int talkTime = superPackage.getTalkTime();
            int smsCount = superPackage.getSmsCount();
            int flow = superPackage.getFlow();
            resultTime = talkTime - realTalkTime;
            resultsmsCount = smsCount - realSMSCount;
            resultFlow = flow - realFlow;
            if (resultTime > 0) {
                sb.append("通话时长：" + resultTime + "分钟\n");
            } else {
                sb.append("通话时长：" + 0 + "分钟\n");
            }

            if (resultsmsCount > 0) {
                sb.append("短信条数：" + resultsmsCount + "条\n");
            } else {
                sb.append("短信条数：" + 0 + "条\n");
            }

            if (resultFlow > 0) {
                sb.append("上网流量：" + resultFlow / 1024 + "GB\n");
            } else {
                sb.append("上网流量：" + 0 + "GB\n");
            }
            return sb.toString();
        }
    }

    // 打印消费详单，以电话号码查询
    public static String consume(HashMap<String, List<Consumlnfo>> consumlnfos, String number) {
        StringBuilder sb = new StringBuilder();
        sb.append("*************" + number + "消费记录*************\n");
        sb.append("序号\t类型\t数据（通话（条）/上网（MB）/短信（条）\n");
        List<Consumlnfo> list = consumlnfos.get(number);
        if (list.isEmpty()) {
            sb.append("暂无消费记录，请重新选择");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Consumlnfo consumlnfo = list.get(i);
                String type = consumlnfo.getType();
                int consumData = consumlnfo.getConsumData();
                if (type.equals("通话")) {
                    sb.append(i + 1 + ".\t" + type + "\t" + consumData);
                } else if (type.equals("上网")) {
                    sb.append(i + 1 + ".\t" + type + "\t" + consumData);
                } else {
                    sb.append(i + 1 + ".\t" + type + "\t" + consumData);
                }
            }
        }
        return sb.toString();
    }

    // 套餐更换
    public static void alter(HashMap<String, MobileCard> hashMap, String number, Scanner sc) {
        MobileCard mobileCard = hashMap.get(number);
        ServicePackage serPackage = mobileCard.getSerPackage();// 电话卡原有套餐
        double money = mobileCard.getMoney();
        ServicePackage packageCase = CarUtil.packageCase(sc);// 套餐选择
        double price = packageCase.getPrice();
        if (serPackage.getPrice() == packageCase.getPrice()) {
            System.out.println("对不起，您已经是该套餐用户，无需换套餐！");
        } else {
            if (money > price) {
                double result = money - price;
                double consumAmount = mobileCard.getConsumAmount();
                consumAmount = consumAmount + price;
                mobileCard.setSerPackage(packageCase);
                mobileCard.setMoney(result);
                mobileCard.setConsumAmount(consumAmount);
                System.out.println("套餐更换成功");
            } else {
                System.out.println("对不起，您的余额不足以支付新套餐资费，请充值后再办理更换套餐业务");
            }
        }
    }

    // 办理退网
    public static String quit(HashMap<String, MobileCard> hashMap, String number) {
        StringBuilder sb = new StringBuilder();
        hashMap.remove(number);
        sb.append("****************办理退网****************\n");
        sb.append("卡号" + number + "办理退网成功！\n");
        sb.append("谢谢使用！\n");
        return sb.toString();
    }

}
