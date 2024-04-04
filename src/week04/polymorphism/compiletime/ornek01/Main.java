package week04.polymorphism.compiletime.ornek01;

public class Main {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();

        int result = mathOperations.add(10,20);
        double result2 = mathOperations.add(20.5,30.3); //içiriye girilen değere göre tip alır


    }
}
