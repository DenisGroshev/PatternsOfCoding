package Patterns.Builder2;

public class Demo {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(250)
                .build();

        System.out.println(car);
    }
}
