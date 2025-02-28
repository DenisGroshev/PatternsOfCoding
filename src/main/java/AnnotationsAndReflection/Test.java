package AnnotationsAndReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
public class Test {
    @MethodInfo(author = "Tomas")
        public void printHelloWorld(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        Test test=new Test();
        test.printHelloWorld();
    }
}
