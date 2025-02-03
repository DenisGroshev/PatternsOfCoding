package Patterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new BlackColor());
        rectangle.draw();
    }
}
