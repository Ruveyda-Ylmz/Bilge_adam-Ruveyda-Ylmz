package Week03.oop.principsles.inheritance.odev01;

public class Vehicle { //araç
    String brand; //marka
    String model;
    int year;

    void start(){ //araç çalıştırma methodu
        System.out.println("Vehicle is starting"); //Araç çalıştırılıyor
    }

    void stop(){
        System.out.println("Vehicle is stopping"); //Araç duruyor
    }
}
