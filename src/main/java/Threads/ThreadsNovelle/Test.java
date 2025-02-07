package Threads.ThreadsNovelle;

public class Test {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        Test test =new Test();
        test.doWork();
    }

    public synchronized void increment(){
        counter++;
    }

    public  void doWork() throws InterruptedException {
        Thread thread=new Thread(()-> {
            for (int i = 0; i < 10000; i++) increment();
        });

        Thread thread2=new Thread(()-> {
            for (int i = 0; i < 10000; i++) increment();
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter);

    }
}
