package Patterns.Strategy1;


public class Strategy {
    public static void main(String[] args) {
        double sPrice=100;
        Context context=new Context(new HalfPrice());
        double price= context.getPrice(sPrice);
        System.out.println(price);
    }
}
