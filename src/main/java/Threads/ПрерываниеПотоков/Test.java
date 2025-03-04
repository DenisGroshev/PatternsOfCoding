package Threads.ПрерываниеПотоков;


import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                int count=0;
                Random random=new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    count++;
                    Math.sin(random.nextDouble());
                }
                System.out.println(count);
            }
        });
        System.out.println("Starting thread");

        thread1.start();
        thread1.sleep(1);
        thread1.interrupt();

        thread1.join();
        System.out.println("Thread has finished");
    }
}
