package Patterns.ChainsOfResponsibility;

public class Book extends Handler {
    private final String titleOfTheBook;

    public Book(String titleOfTheBook) {
        this.titleOfTheBook = titleOfTheBook;
    }

    @Override
    public void handle(Order order) {
        if (notInStock()) {
            System.out.printf("Sorry, book named %s is not in stock\n", titleOfTheBook);
            super.handle(order);
        } else {
            System.out.printf("Yes, %s is in stock, we'll send her %s\n", titleOfTheBook, order.getId());
        }
    }


    private boolean notInStock(){
        return Math.random()<0.85;
    }
}

