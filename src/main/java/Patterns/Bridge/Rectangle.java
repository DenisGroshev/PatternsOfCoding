package Patterns.Bridge;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle!");
        color.Color();
    }
}
