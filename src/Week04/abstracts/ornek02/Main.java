package Week04.abstracts.ornek02;

import Week03.oop.principsles.inheritance.ornek02.Circle;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----rectanle------");
        Rectangle rectangle =new Rectangle(5,6);
        System.out.println(rectangle.calculateArea());
        rectangle.draw();

        System.out.println("-----circle------");
        Circle circle=new Circle(3.5);
        System.out.println();

    }
}
