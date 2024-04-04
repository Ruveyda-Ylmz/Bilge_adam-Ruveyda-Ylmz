package week03.oop.principsles.inheritance.odev01;

public class Car extends Vehicle {

    int numDoors;

    @Override
    void start() {
        System.out.println("car is starting");
    }

    @Override
    void stop() {
        System.out.println("car is stopping");
    }
}
