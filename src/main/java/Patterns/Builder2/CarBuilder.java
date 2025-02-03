package Patterns.Builder2;

public class CarBuilder {
    String m;
    Transmission t;
    int s;

    CarBuilder buildMake(String m){
        this.m=m;
        return this;
    }
    CarBuilder buildTransmission(Transmission t){
        this.t=t;
        return this;
    }
    CarBuilder buildMaxSpeed(int s){
        this.s=s;
        return this;
    }

    Car build(){
        Car car=new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
