package Week03.oop.principsles.inheritance.odev01;

public class Truck extends Vehicle { //kamyon
    double cargoCapacity; //kargo kapasitesi


    @Override
    void start() {
        System.out.println("Truck is starting"); //Kamyon başlıyor
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping"); //Kamyon duruyor
    }







}
