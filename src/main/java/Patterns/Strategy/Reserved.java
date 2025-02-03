package Patterns.Strategy;

public class Reserved implements Book{
    @Override
    public void exist() {
        System.out.println("Not selling in the stock jusqu'a 5h du soir");
    }
}
