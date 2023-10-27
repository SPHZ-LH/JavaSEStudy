package a01Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized (MyThread.class) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + " " + ticket);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
            //}
        }
    }
}
