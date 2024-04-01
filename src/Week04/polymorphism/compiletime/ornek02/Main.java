package Week04.polymorphism.compiletime.ornek02;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int yaz =calculator.sum(10,20);
        double yaz2 =calculator.sum(15.5,20);

        System.out.println("toplam: "+yaz);
        System.out.println("toplam: "+yaz2);

    }
}
