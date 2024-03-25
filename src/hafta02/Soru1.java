package hafta02;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //birden başlayarak kullamıcını dışarıdan girdiği sayıya kadar olan sayıların
        // bir fazlasının toplamını ekrana yazdıran algoritama.

        int sayi ,
            toplam=0,
            deger;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for (int i=1 ;i<=sayi;i++){
            toplam=toplam+(i+1);
        }
        System.out.println("toplam: "+toplam);


        }
    }
