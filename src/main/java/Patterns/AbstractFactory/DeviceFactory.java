package Patterns.AbstractFactory;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchpad();

}
