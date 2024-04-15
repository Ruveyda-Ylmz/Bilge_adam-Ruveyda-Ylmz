package week03.exceptions;

public class HandlingException { // İstisna İşleme
    public static void main(String[] args) {
        int number1 = 5;
        try{
            System.out.println((number1/0));
        }catch (ArithmeticException e){
            System.out.println("caught ArithmeticException yakalandi");
        }catch (Exception e){
            System.out.println("caught exception");
        } finally { //son olarak girer ve içindeki işlemleri yapar (hata olsada olmasada)
            System.out.println("dünya");
            System.out.println("merhaba");

        }
        System.out.println("kodun bitişi");
    }
}
