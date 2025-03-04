package Threads.ClassCount;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(1);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++)
            executorService.submit(new Processor(i, cdl));

        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            cdl.countDown();
        }
    }
}
class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id, CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
        this.id=id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread with id "+id+" proceeded.");
    }
}
