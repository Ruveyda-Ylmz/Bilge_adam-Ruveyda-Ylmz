package Week04.interfaceexamples.ornek01;

public class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int width) {
        System.out.println("the area of the rectangle is "+(length*width));
    }
}
