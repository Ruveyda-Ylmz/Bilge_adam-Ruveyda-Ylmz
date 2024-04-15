package week03.arrays;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //kullanıcı 0 girene kadar aldığı tüm sayıların toplayan ve ekran basan program.

        int sayi ,
            toplam=0;

        Scanner scanner = new Scanner(System.in);

        do
         {
            System.out.println("lütfen bir sayi giriniz: ");
            sayi = scanner.nextInt();
            toplam = toplam + sayi;
            if (sayi == 0) {
                System.out.println("sayi sıfıra eşit"+ "\n"+
                                   "sayiların toplamı: 0" + toplam);
            }
        }while (sayi>0);

  System.out.println("toplam" +toplam);


    }
}
