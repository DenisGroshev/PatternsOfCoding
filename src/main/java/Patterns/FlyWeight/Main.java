package Patterns.FlyWeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        List<Shape> shapes=new ArrayList<>();

        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("еда"));

        Random rnd=new Random();
        for(Shape shape:shapes){
            int x=rnd.nextInt(100   );
            int y=rnd.nextInt(100);
            shape.draw(x,y);
        }
    }
}
