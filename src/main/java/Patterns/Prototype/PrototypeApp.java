package Patterns.Prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original=new Human(18, "Vasya");
        Human copy=(Human)original.copy();
        System.out.println(copy);

        HumanFactory humanFactory=new HumanFactory(copy);
        Human h1=humanFactory.makeCopy();
        System.out.println(h1);

        humanFactory.setPrototype(new Human(30, "Valery"));
        Human h2=humanFactory.makeCopy();
        System.out.println(h2);
    }
}
