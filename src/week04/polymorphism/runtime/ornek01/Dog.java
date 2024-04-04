package week04.polymorphism.runtime.ornek01;

public class Dog extends Animal { //kalıtım
    @Override
    void makeSound() {
        System.out.println("dog barks");
    }
}
