package week03.exceptions;

public class HandlingException {
    public static void main(String[] args) {
        int number1 = 5;
        try{
            System.out.println((number1/0));
        }catch (ArithmeticException e){
            System.out.println("cought ArithmeticException yakalandi");
        }catch (Exception e){
            System.out.println("Cought exception");
        } finally {
            System.out.println("dünya");
            System.out.println("merhaba");

        }
        System.out.println("kodun bitişi");
    }
}
