package Patterns.AbstractFactory;

public class EnMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Click a mouse");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click a mouse");
    }

    @Override
    public void scroll(int direction) {
        if(direction>0)
            System.out.println("Scrolling up");
        else if (direction<0)
            System.out.println("Scrolling down");
        else
            System.out.println("No scrolling");
        }
}
