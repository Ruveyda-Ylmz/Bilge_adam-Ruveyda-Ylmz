package Week03.oop.principsles.inheritance.ornek02;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public  Circle(String color,double radius){
       super(color);
       this.radius = radius;
   }


    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double calculateArea() {
        return  Math.PI* Math.pow(radius,2);
    }
}
