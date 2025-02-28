package Threads.ThreadsSynch;

import Patterns.TemplateMethod.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        new Worker().main();

    }
}
class Worker {
    Random random=new Random();

    Object lock1=new Object();
    Object lock2=new Object();

    private List<Integer> list=new ArrayList<>();
    private List<Integer> list2=new ArrayList<>();


    public void addToListOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.add(random.nextInt(100));
        }
    }

    public void     addToLitTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToLitTwo();
            addToListOne();
        }
        addToListOne();
        addToLitTwo();
    }

    public void main(){
        long before=System.currentTimeMillis();
        work();

        Thread thread1=new Thread(() -> work());

        Thread thread2=new Thread(() -> work());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        long after=System.currentTimeMillis();
        System.out.println("Programe took " + (after-before)+" ms to run");




        System.out.println("List1: "+list.size());
        System.out.println("List2: "+list2.size());
    }

}
