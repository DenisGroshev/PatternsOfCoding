package Patterns.Proxy2;

public class RealImage implements Image{
    String file;
    public RealImage(String file){
        this.file=file;
        load();
    }

    void load(){
        System.out.println("Загрузка "+file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр "+file);
    }
}
