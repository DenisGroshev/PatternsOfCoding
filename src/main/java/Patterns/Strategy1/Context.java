package Patterns.Strategy1;

public class Context {
    StrategyInt strategyInt;

    public Context(StrategyInt strategyInt) {
        this.strategyInt = strategyInt;
    }

    public double getPrice(double price){
        return strategyInt.getPrice(price);
    }
}
