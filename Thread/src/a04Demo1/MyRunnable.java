package a04Demo1;

public class MyRunnable implements Runnable {
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + " " + ticket);
        }
        return false;
    }
}
