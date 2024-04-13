package week05bayram_tatili.odevler.odev01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HarfIndexBulucu {
    public static void main(String[] args) {

        List<String> numberList =new ArrayList<>();

        Islemler islem = new Islemler();

        int secenek=0;
        String kelime,
               iharf,
               dharf;

        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU \n" +
                           "girmek istediğiniz menünün sayısını tuşlayın... \n"+
                           " 1-Harf Bulucu\n"+
                           " 2-Harf Değiştirici\n"+
                           " 3-Palindrom ");
        secenek = scanner.nextInt();

        switch (secenek) {
            case 1:
                System.out.println("bir kelime giriniz : ");
                kelime = scanner.next();
                scanner.nextLine();

                System.out.println("bulmak istediğiniz bir harf giriniz : ");
                iharf = scanner.next();
                islem.harfbulucu(kelime,iharf);
                break;
            case 2:
                System.out.println("bir kelime giriniz : ");
                kelime = scanner.next();
                scanner.nextLine();

                System.out.println("bulmak istediğiniz bir harf giriniz : ");
                iharf = scanner.next();
                scanner.nextLine();

                System.out.println("değiştirileceği harfi giriniz : ");
                dharf = scanner.next();
              islem.harfdegistirici(kelime,iharf,dharf);
              break;
            case 3:
                System.out.println("bir kelime giriniz : ");
                kelime = scanner.next();
                scanner.nextLine();
                islem.palindrom_kontrol(kelime);
                break;

            default:
                System.out.println("geçersiz veri girilmiştir.");
        }








    }
}
