package Patterns.ChainsOfResponsibility;


public class Demo {
            public static void main(String[] args) {
                Handler handler=new Repeater();
                handler.bind(new Book("Gump forest"))
                        .bind(new Book("Thousand year war"))
                        .bind(new Book("War and piece"))
                        .bind(handler);

                Order order=new Order("1");
                handler.handle(order);
    }
}
