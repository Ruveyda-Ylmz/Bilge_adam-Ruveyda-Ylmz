package week04.polymorphism.runtime.ornek02;

public class Terrier extends Dog{

    int size =2;

    @Override
    void feetSize() {
        System.out.println("terrier's feetsize");
    }

    @Override
    void gender() {
        System.out.println("female");
    }
}
