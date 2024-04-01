package Week03.oop.principsles.inheritance.odev01;

public class Vehicle {
    String brand;
    String model;
    int year;

    void start(){ //araç çalıştırma methodu
        System.out.println("Vehicle is starting");
    }

    void stop(){
        System.out.println("Vehicle is stopping");
    }
}
