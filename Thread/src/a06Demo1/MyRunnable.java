package a06Demo1;

public class MyRunnable implements Runnable {
    int count = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (count < 10) {
                    System.out.println("礼物还剩下" + count + "不再赠送");
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
