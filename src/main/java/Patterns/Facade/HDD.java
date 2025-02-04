package Patterns.Facade;

public class HDD {
    void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("Копируются данные с диска");
        }else{
            System.out.println("Вставьте диск с данными");
        }
    }
}
