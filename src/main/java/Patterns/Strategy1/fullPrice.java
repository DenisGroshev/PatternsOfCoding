package Patterns.Strategy1;

public class fullPrice implements StrategyInt{

    @Override
    public double getPrice(double price) {
        return price;
    }
}
