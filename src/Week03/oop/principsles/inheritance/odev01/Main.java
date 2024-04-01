package Week03.oop.principsles.inheritance.odev01;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck();
        Car car = new Car();
        Motorcycle motorcycle= new Motorcycle();

        truck.cargoCapacity=4;
        truck.year=2000;
        truck.model="xx";
        truck.brand="Volvo";

        car.numDoors=4;
        car.year=2000;
        car.model="xx";
        car.brand="DS";

        motorcycle.hasSidecar=false;
        motorcycle.year=2000;
        motorcycle.model="xx";
        motorcycle.brand="Yamaha";

        truck.start();
        System.out.println("-TRUCK-"+"\n"+"cargoCapacity= "+truck.cargoCapacity+"\n"+
                                      "year= "+truck.year+"\n"+
                                      "model= "+truck.model+"\n"+
                                      "brand= "+truck.brand);
        truck.stop();
        System.out.println("---------------------------");

        car.start();
        System.out.println("-CAR-"+"\n"+"numDoors= "+car.numDoors+"\n"+
                                      "year= "+car.year+"\n"+
                                      "model= "+car.model+"\n"+
                                      "brand= "+car.brand);
        car.stop();
        System.out.println("----------------------------");

        motorcycle.start();
        System.out.println("-MOTORCYCLE-"+"\n"+"hasSidecar= "+motorcycle.hasSidecar+"\n"+
                                                "year= "+motorcycle.year+"\n"+
                                                "model= "+motorcycle.model+"\n"+
                                                "brand= "+motorcycle.brand);

        motorcycle.stop();
        System.out.println("----------------------------");


    }

}
