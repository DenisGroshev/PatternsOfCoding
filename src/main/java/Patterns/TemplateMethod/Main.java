package Patterns.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        a.templateMethod();
        System.out.println();
        B b =new B();
        b.templateMethod();
    }
}
