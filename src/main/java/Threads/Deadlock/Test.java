package Threads.Deadlock;

import Patterns.SingleTonAnotherOne.R;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runner runner=new Runner();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        runner.finished();
    }
}
class Runner{
    private Account account1=new Account();
    private Account account2=new Account();

    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();


    private void takeLocks(Lock lock1, Lock lock2){
        boolean firstLockTaken=false;
        boolean secondLockTaken=false;

        while(true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {


                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void firstThread(){
        Random random=new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1,lock2);
                try {
                    Account.transfer(account1, account2, random.nextInt(100));
                } finally {


                    lock1.unlock();
                    lock2.unlock();
            }
        }
    }
    public void secondThread() {
        Random random=new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2, lock1);
            try {
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }
    public void finished(){
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance "+(account1.getBalance()+account2.getBalance()));
    }
}
class Account{
    private int balance=10_000;

    public void deposit(int amount){
        balance+=amount;
    }

    public void withDraw(int amount){
        balance-=amount;
    }
    public int getBalance(){
        return this.balance;
    }
    public static void transfer(Account account1, Account account2, int amount){
        account1.withDraw(amount);
        account2.deposit(amount);
    }
}
