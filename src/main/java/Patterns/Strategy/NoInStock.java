package Patterns.Strategy;

public class NoInStock implements Book{

    @Override
    public void exist() {
        System.out.println("Not selling, cause not in stock");
    }
}
