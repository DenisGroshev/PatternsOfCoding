package Patterns.AbstractFactory;


public class FRKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Français keyboard est activé");
    }

    @Override
    public void println() {
        System.out.println("Français keyboard avec la ligne");
    }
}
