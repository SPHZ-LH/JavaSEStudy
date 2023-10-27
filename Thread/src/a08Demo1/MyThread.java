package a08Demo1;

import java.util.Random;

public class MyThread extends Thread {
    public static double money = 100;
    public static int count = 3;
    public static double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(Thread.currentThread().getName() + "没有抢到红包");
            } else {
                double price;
                if (count == 1) {
                    price = money;
                } else {
                    double MAX = money - (count - 1) * MIN;
                    Random r = new Random();
                    price = r.nextDouble(MAX);
                    if (price < MIN) {
                        price = MIN;
                    }
                    money = money - price;
                }
                System.out.println(Thread.currentThread().getName() + "抢到了" + price + "元");
                count--;
            }
        }
    }
}
