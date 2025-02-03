package Patterns.Proxy;

import java.util.Currency;
import java.util.HashMap;

public class CurrencyProxy implements CurrencyBookService{
    private final CurrencyBookService currencyBookService;
    private final HashMap<Currency, Double> currencyMap=new HashMap<>();

    public CurrencyProxy(){
        this.currencyBookService=new CurrencySale();
    }

    public double getDailyCurrencySale(Currency currency){
        if (currencyMap.containsKey(currency)) {
            return currencyMap.get(currency);
        }
        double daily=currencyBookService.getDailyCurrencySale(currency);
        currencyMap.put(currency, daily);
        return daily;
    }
}
