package week05bayram_tatili.odevler.odev07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Insan insan = new Insan();
        Bilgisayar bilgisayar = new Bilgisayar();
        Karsilastirma karsilastirma = new Karsilastirma();

        Scanner scanner = new Scanner(System.in);

        Boolean islem = true;
        int insan_secim,
            bilgisayar_secim,
            sonuc=0;
        String d_secim;

        System.out.println("Taş Kağıt Makas oyununa hoşgeldiniz:))");

        while (islem){

           insan_secim = insan.i_secim();
           bilgisayar_secim = bilgisayar.b_secim();
           sonuc=karsilastirma.karsilastir(bilgisayar_secim,insan_secim);

           System.out.println("insan seçim : "+insan.insan_secim+" ----- "+"bilgisayar seçim : "+bilgisayar.bilgisayar_secim);
           switch (sonuc){
               case 1: insan.i_skor++;
                   System.out.println("İnsan kazandı!");
                   break;
               case 2 : bilgisayar.b_skor++;
                   System.out.println("Bilgisayar kazandı!");
                   break;
               case 3 :
                   System.out.println("Berabere");
                   break;
           }

            System.out.println("İnsan skoru: "+insan.i_skor+" ----- Bilgisayar skor: "+bilgisayar.b_skor);
            System.out.println("devam etmek istiyorsanız 'E' ,istemiyorsanız 'H' yi tuşlayınız!");

            d_secim = scanner.nextLine();

            switch (d_secim){
                case "H": islem =false;
                    System.out.println("İnsan skoru: "+insan.i_skor+" ----- Bilgisayar skor: "+bilgisayar.b_skor);
                    break;
                case "E" : islem =true;
                           break;
                default:
                    System.out.println("yanlış tuşlama"); break;
            }
        }



    }
}
