package Patterns.Strategy;

public class Demo {
    public static void main(String[] args) {
        BookReal bookReal=new BookReal();

        bookReal.setBookState(new Selling());
        bookReal.executeBookState();

        bookReal.setBookState(new Reserved());
        bookReal.executeBookState();

        bookReal.setBookState(new NoInStock());
        bookReal.executeBookState();



    }
}
