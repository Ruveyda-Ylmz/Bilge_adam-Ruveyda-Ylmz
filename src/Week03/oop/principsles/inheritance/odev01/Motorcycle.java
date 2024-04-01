package Week03.oop.principsles.inheritance.odev01;

public class Motorcycle extends Vehicle { //Motosiklet

    boolean hasSidecar; //Sepeti var


    @Override
    void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle is stopping");
    }
}
