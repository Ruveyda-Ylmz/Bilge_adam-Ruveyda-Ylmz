package week04.polymorphism.runtime.ornek01;

public class Main {
    public static void main(String[] args) {

        Animal animal= new Animal(); //animal sınıfından oluşturulan bir nesne Animal tipinde bir referansla tutuluyor.

        Animal animal2 = new Dog(); //dos sınıfından oluşturulan bir nesne animal tipinde bir referans ile tutuluyor
        animal2.makeSound(); //dog animalı ezer


    }
}
