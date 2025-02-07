package Patterns.Strategy1;

public class HalfPrice implements StrategyInt{
    @Override
    public double getPrice(double price) {
        return price*0.5;
    }
}
