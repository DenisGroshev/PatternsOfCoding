package Patterns.Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Square!");
        color.Color();
    }
}
