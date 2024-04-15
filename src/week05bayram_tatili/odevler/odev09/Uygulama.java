package week05bayram_tatili.odevler.odev09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama {
    public static List<Muhendis> muhendis_vt = new ArrayList<>();
    public static List<OfisCalisan> ofiscalisan_vt = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void menu(){
        int secenek = 0,maas;
        String isim,soyisim;
        System.out.println("-MENU-");
        System.out.println("1 - Mühendis Menüsü");
        System.out.println("2 - Ofis Çalışanı Menüsü");
        System.out.println("0 - Çıkış");

        secenek = scanner.nextInt();
        switch (secenek){
            case 1:
                System.out.println("1 - Mühendis Ekle");
                System.out.println("2 - Mühendis Maaş Güncelle");
                System.out.println("3 - Mühendis Liste");
                secenek = scanner.nextInt();
                switch (secenek){
                    case 1:
                        System.out.println("İsim giriniz: ");
                        isim = scanner.next();
                        System.out.println("Soyisim giriniz: ");
                        soyisim = scanner.next();
                        System.out.println("Maaş Giriniz: ");
                        maas = scanner.nextInt();
                        Muhendis muhendis = new Muhendis(isim,soyisim,maas);
                        muhendis_vt.add(muhendis);
                        break;
                    case 2:
                        break;
                    case 3:
                        for(Muhendis mhnds: muhendis_vt){
                            System.out.println("İsim: " + mhnds.isim + "\n" +
                                               "Soyisim: " + mhnds.soyisim + "\n" +
                                               "Unvan: " + mhnds.unvan + "\n" +
                                               "Maaş: " + mhnds.maas + "\n");
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("1 - Ofis Çalışanı Ekle");
                System.out.println("2 - Ofis Çalışanı Ekle");
                System.out.println("3 - Ofis Çalışanı Liste");
                secenek = scanner.nextInt();
                switch (secenek){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 0:
                break;
        }
        if ( secenek != 0 ){
            menu();
        }

    }
}
