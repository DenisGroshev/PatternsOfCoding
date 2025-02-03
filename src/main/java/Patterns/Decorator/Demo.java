package Patterns.Decorator;


public class Demo {
    public static void main(String[] args) {
        Book bookChip=new SimpleBookMoinsQueThreeHPages();
        System.out.println("Price of chip book: "+bookChip.getPrice()+" rubles.");

        Book bookLux=new BookPagesOverThree(bookChip);
        System.out.println("Price of lux book: "+bookLux.getPrice()+" rubles.");
    }
}
