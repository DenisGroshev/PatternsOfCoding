package Patterns.Decorator;

public class SimpleBookMoinsQueThreeHPages implements Book{
    private int PRICE=250;
    @Override
    public double getPrice() {
        return PRICE;
    }
}
