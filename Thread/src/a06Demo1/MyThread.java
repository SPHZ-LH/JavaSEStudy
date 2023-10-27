package a06Demo1;

public class MyThread extends Thread {
    public static int count = 100;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (a05Demo1.MyThread.class) {
                System.out.println("礼物还剩下" + count + "不再赠送");
                if (count < 10) {
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "送出了1份礼物");
                    count--;
                    System.out.println("还剩下" + count + "份礼物");
                }
            }
        }
    }
}
