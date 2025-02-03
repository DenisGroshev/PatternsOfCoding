package Patterns.AbstractFactory;

public class FRMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("C'est le click");
    }

    @Override
    public void dbclick() {

        System.out.println("C'est le double click");
    }

    @Override
    public void scroll(int direction) {
        if(direction>0)
            System.out.println("Vous montez");
        else if (direction<0)
            System.out.println("Vous descendez");
        else
            System.out.println("Vous bougez pas");
    }
}
