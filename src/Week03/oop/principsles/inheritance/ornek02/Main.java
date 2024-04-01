package Week03.oop.principsles.inheritance.ornek02;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("orenca",10);
        circle.draw();
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle("Red",5,10);
        rectangle.draw();
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle("white",3.72,7.53);
        triangle.draw();
        System.out.println("Üçgenin Alanı "+triangle.calculateArea());
    }

}
