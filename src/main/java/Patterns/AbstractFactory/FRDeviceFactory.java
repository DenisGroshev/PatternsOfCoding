package Patterns.AbstractFactory;

public class FRDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new FRMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new FRKeyboard();
    }

    @Override
    public TouchPad getTouchpad() {
        return new FRTouchpad();
    }
}
