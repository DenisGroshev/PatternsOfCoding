package Patterns.Facade;

public class DVDRom {
    private boolean data=false;
    public boolean hasData(){
        return data;
    }
    void load(){
        System.out.println("Диск загружен");
        data=true;
    }
    void unLoad(){
        System.out.println("Диск вынут");
        data=false;
    }
}
