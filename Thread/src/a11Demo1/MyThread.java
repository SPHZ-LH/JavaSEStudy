package a11Demo1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    System.out.println(getName() + " " + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    boxList.add(price);
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
