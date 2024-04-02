package Week04.finalexamples.ornek01;

public class FinalVariableExample01 {
    private  static final double PI=3.14159;

    public static void main(String[] args) {
        final int age =10;
        System.out.println(age);
      //  age =25; //bunu uygulamayız,age değişkeni final olduğu için yeni değer atamsı kabul etmez.
        System.out.println(age);
    }


}
