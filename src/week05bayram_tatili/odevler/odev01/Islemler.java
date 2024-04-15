package week05bayram_tatili.odevler.odev01;

import java.util.Arrays;

public class Islemler {

    public static int sayac=0,
                      harf_sayac=0,
                      i=0;
    public static char[] harfler;

    public static char[] polindrom;


    //harf bulucu method1------------------------------------------------------------------------
    public static void harfbulucu(String kelime, String iharf) {
        //string değikeninde ki veriiyi char arraye dönüştürüp transfer etti
        harfler = kelime.toCharArray();

        //kelimenin içinde ki istenilen harfin kaçıncı index de olduğunu bulan kod
        for(char harf: harfler)
        {
            if (harf == iharf.charAt(0)){ //
                System.out.println("girilen harf: " + harf+ "\t" + sayac + ".index'tedir.");
                harf_sayac++;
            }
            sayac++;
        }
        if (harf_sayac==0){
            System.out.println("Girdiğiniz harf tanımlanan kelimede bulunmamaktadır.");
        }else {
            System.out.println("girdiğiniz harf "+kelime+" kelimesinin içerisinde "+harf_sayac+ " adettir.");
        }
    }



    //harf değştirici method2-----------------------------------------------------------------------
    public static void harfdegistirici(String kelime, String iharf,String dharf) {

        harfler = kelime.toCharArray();
        for(char harf: harfler)
        {
            if (harf == iharf.charAt(0)){
                harfler[sayac] = dharf.charAt(0);

                harf_sayac++;
            }
            sayac++;
        }
        if (harf_sayac==0){
            System.out.println("Girdiğiniz harf tanımlanan kelimede bulunmamaktadır.");
        }else {

            System.out.print("kelimenin değiştirilmiş son hali : ");
            System.out.print(harfler);
            //System.out.println(Arrays.toString(harfler));
        }
    }


    // Palindrom Kontrolü method3------------------------------------------------------------------
    public static void palindrom_kontrol(String kelime) {

        harfler = kelime.toCharArray();
        polindrom = harfler;
        for (int ssayac = ( harfler.length - 1 ); ssayac >= 0 ;ssayac--){
            polindrom[i] = harfler[ssayac];
            i++;
        }

        if (harfler == polindrom){
            System.out.println("“Girdiğiniz "+kelime+" kelimesi palindromdur.”");
        }else {
            System.out.println("Girdiğiniz "+kelime+"kelimesi palindrom değildir.");
        }
    }
}
