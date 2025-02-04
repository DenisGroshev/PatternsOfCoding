package Patterns.Facade;

public class Computer {
    DVDRom dvd=new DVDRom();
    Power power=new Power();
    HDD hdd=new HDD();

    void hasData(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
    void hasntData(){
        power.on();
        hdd.copyFromDVD(dvd);
    }
}
