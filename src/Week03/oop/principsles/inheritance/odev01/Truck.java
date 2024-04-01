package Week03.oop.principsles.inheritance.odev01;

public class Truck extends Vehicle {
    double cargoCapacity;


    @Override
    void start() {
        System.out.println("Truck is starting");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping");
    }







}
