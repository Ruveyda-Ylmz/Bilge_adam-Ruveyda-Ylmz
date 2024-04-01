package Week04.polymorphism.runtime.ornek02;

public class TestOverride {
    public static void main(String[] args) {

        System.out.println("------------------------");
        System.out.println("Animal");
        Animal animal = new Animal();
        animal.feetSize();
        System.out.println(animal.size);


        System.out.println("------------------------"+ "\n");
        System.out.println("dogAnimal");
        Animal dogAnimal = new Dog();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size); //davranışlar sınıftan gelir
        System.out.println(dogAnimal.name);

        System.out.println("------------------------"+ "\n");
        System.out.println("dog");
        Dog dog = new Dog();
        dog.feetSize();
        System.out.println(dog.size); //davranışlar sınıftan gelir
        System.out.println(dog.name);

        System.out.println("------------------------"+ "\n");
        System.out.println("trrierDog");
        Dog trrierDog = new Terrier();
        trrierDog.feetSize();
        System.out.println(trrierDog.size); //davranışlar sınıftan gelir
        trrierDog.gender();

        System.out.println("------------------------"+ "\n");
        Animal terrierAnimal = new Terrier(); //sola göre oluşturulur ,sağ taraf davranışalrı belirler, sol taraf özniteliği belirler.
        terrierAnimal.feetSize();
        System.out.println(terrierAnimal.size);
        System.out.println(terrierAnimal.name);

    }
}
