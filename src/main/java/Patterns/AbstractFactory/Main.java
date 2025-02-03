package Patterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory factory=getFactoryByCountry("FR");
        Mouse m= factory.getMouse();
        Keyboard k= factory.getKeyboard();
        TouchPad t=factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10,35);

    }

    public static DeviceFactory getFactoryByCountry(String lang) {
        switch (lang) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            case "FR":
                return new FRDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }
}
