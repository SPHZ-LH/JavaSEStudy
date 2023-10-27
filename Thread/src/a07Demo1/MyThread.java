package a07Demo1;

public class MyThread extends Thread {
    public static int count = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (count > 100) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (count % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " " + count);
                    }
                    count++;
                }
            }
        }
    }
}
