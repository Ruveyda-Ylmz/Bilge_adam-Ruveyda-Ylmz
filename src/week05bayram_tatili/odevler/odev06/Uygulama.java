package week05bayram_tatili.odevler.odev06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama {
    public static List<String> numberList = new ArrayList<>();
    public static int gecikme = 5000; //gecikme saniyesi
    public static void menu() throws InterruptedException { //-----------------------------------
        String secenek;
        char secenekchar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-MENÜ-");
        System.out.println("+ Toplama");
        System.out.println("- Çıkartma");
        System.out.println("/ Bölme");
        System.out.println("* Çarpma");
        System.out.println("X Çıkış");
        System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEM TÜRÜNÜ GİRİNİZ! : ");
        secenek = scanner.nextLine();
        secenekchar = secenek.charAt(0);
        
        switch (secenekchar) {
            case '+': toplama(); break;
            case '-': cikarma(); break;
            case '/': bolme(); break;
            case '*': carpma(); break;
            case 'X': break;
            default:
                System.out.println("geçersiz değer girdiniz!");
        }
        if (secenekchar != 'X'){
            menu();
        }
    }

    public  static void sayi_gir() {//--------------------------------------------------------
        boolean kontrol = false;
        SayiKontrol s_kontrol = new SayiKontrol();
        String deger = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıları giriniz : ");
        
        while ( !deger.equals("=") ){
            deger = scanner.nextLine(); //klvyden değer atama
            if ( !deger.equals("=") ) { //= görene kadar değer ata
                kontrol = s_kontrol.sayikontrol(deger);
                if (kontrol) {
                    numberList.add(deger); //kontrol true ise yani değerler sayı ise sayıları numberlist e ata
                } else {
                    System.out.println("Lütfen geçerli bir değer giriniz!");
                }
            }
        }
        
        if (numberList.isEmpty()){ //boş mu
            System.out.println("Hiçbir değer girilmeden işlem yapılamaz!");
            sayi_gir();
        }
    }
    
    public static void toplama () throws InterruptedException {//-------------------------------
        double sonuc = 0;
        int sayi;

        sayi_gir();

        for(String dgr: numberList){
            sayi = Integer.parseInt(dgr); //string degeri int degere dönüşüm yapıyoruz
            sonuc = sonuc + sayi;
        }

        System.out.println("Sonuç = " + sonuc);
        numberList.clear();
        Thread.sleep(gecikme); //3 saniye gecikmeli çalışma
    }

    public static void cikarma () throws InterruptedException {//------------------------------
        double sonuc = 0;
        int sayi;
        sayi_gir();

        for(String dgr: numberList){
            if (sonuc == 0){
                sonuc = Float.parseFloat(dgr);
                continue;
            }
            sayi = Integer.parseInt(dgr); //string degeri int degere dönüşüm yapıyoruz
            sonuc = sonuc - sayi;
        }
        
        System.out.println("Sonuç : "+ sonuc);
        numberList.clear();
        Thread.sleep(gecikme); //3 saniye gecikmeli çalışma,trow
    }

    public static void bolme () throws InterruptedException {//--------------------------------
        double sonuc = 0;
        int sayi;
        sayi_gir();

        for(String dgr: numberList){
            if (sonuc == 0){
                sonuc = Float.parseFloat(dgr);
                continue;
            }
            sayi = Integer.parseInt(dgr); //string degeri int degere dönüşüm yapıyoruz
            sonuc = sonuc / sayi;
        }
        
        System.out.println("Sonuç : "+ sonuc);
        numberList.clear();
        Thread.sleep(gecikme); //3 saniye gecikmeli çalışma,trow
    }

    public static void carpma () throws InterruptedException { //------------------------------
        int sonuc = 0;
        int sayi;
        
        sayi_gir();

        for(String dgr: numberList){
            if (sonuc == 0){
                sonuc = Integer.parseInt(dgr);
                continue;
            }
            sayi = Integer.parseInt(dgr); //string degeri int degere dönüşüm yapıyoruz
            sonuc = sonuc * sayi;
        }
        
        System.out.println("Sonuç : "+ sonuc);
        numberList.clear();
        Thread.sleep(gecikme); //3 saniye gecikmeli çalışma,trow
    }
}