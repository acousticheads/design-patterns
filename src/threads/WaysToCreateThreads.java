package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

public class WaysToCreateThreads {

    private static int count = 0;
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Thread t1 = new Thread(() -> {
            reentrantLock.lock();
                for (int i = 1; i <= 100000; i++) {
                    count = count + 1;

            }
            reentrantLock.unlock();
            System.out.println("done 1...");

        });

        Thread t2 = new Thread(() -> {

            reentrantLock.lock();
            for (int i = 1; i <= 100000; i++) {
                count = count + 1;

            }
            reentrantLock.unlock();
            System.out.println("done 2...");

        });

        t1.start();
        t2.start();
        t2.join();
        t1.join();


        System.out.println(count);


    }

}
