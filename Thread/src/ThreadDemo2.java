import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc =new MyCallable();
        FutureTask<Integer> ft =new FutureTask<>(mc);
        Thread t =new Thread(ft);
        t.start();
        Integer integer = ft.get();
    }
}
