package Patterns.SingleTonAnotherOne;

public class Singleton {
    public static int counter=0;
    private static Singleton instance;

    private Singleton() {
        counter++;
    }

    private static class SingleTon{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance() {
        counter++;
       return SingleTon.INSTANCE;
    }
}
