package Patterns.TemplateMethod;

public abstract class C {
    void templateMethod(){
        System.out.print("1");
        differ();
        System.out.print("3");
    }
    abstract void differ();
}
