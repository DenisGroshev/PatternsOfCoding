package Patterns.AbstractFactory;

public class FRTouchpad implements TouchPad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s=(int) Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY,2));
        System.out.println("Vous bougez sur "+s+" pixels");
    }
}
