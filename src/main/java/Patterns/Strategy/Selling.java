package Patterns.Strategy;

public class Selling implements Book{

    @Override
    public void exist() {
        System.out.println("Selling");
    }
}
