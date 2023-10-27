package a10Demo1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    static {
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    if (getName().equals("抽奖箱1")) {
                        System.out.println(list1);
                        System.out.println(Collections.max(list1));
                    } else {
                        System.out.println(list2);
                        System.out.println(Collections.max(list2));
                    }
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    String name = Thread.currentThread().getName();
                    if (name.equals("抽奖箱1")) {
                        list1.add(price);
                    } else {
                        list2.add(price);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
