package Patterns.Proxy;

import java.util.Currency;
import java.util.Random;

public class CurrencySale implements CurrencyBookService{
    @Override
    public double getDailyCurrencySale(Currency currency) {
        Random rnd=new Random();
        double result=100*rnd.nextDouble();
        double scale=Math.pow(10,2);
        return Math.round(result*scale)/scale;
    }
}
