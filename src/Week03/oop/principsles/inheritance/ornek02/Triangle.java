package Week03.oop.principsles.inheritance.ornek02;

public class Triangle extends Shape{
        double base; //taban
        double height; //yükseklik

    public Triangle(String color ,double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
        void draw() {
            System.out.println("Drawing a Triangle");
        }

        @Override
        double calculateArea() {
            return base*height/2;
        }
}

