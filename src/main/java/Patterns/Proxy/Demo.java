package Patterns.Proxy;

import java.util.Currency;

public class Demo {
    private static final String RUB="RUB";

    public static void main(String[] args) {
        CurrencyBookService currencyBookService=new CurrencyProxy();
        Currency book= Currency.getInstance(RUB);

        System.out.println("Sale is "+currencyBookService.getDailyCurrencySale(book)+" rubles.");
        System.out.println("Sale is "+currencyBookService.getDailyCurrencySale(book)+" rubles.");
        System.out.println("Sale is "+currencyBookService.getDailyCurrencySale(book)+" rubles.");
    }
}
