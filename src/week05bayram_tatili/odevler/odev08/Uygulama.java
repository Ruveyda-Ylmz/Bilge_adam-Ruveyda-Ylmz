package week05bayram_tatili.odevler.odev08;

import java.util.Scanner;

public class Uygulama {

    public static  Database database = new Database();
    public static void menu(){
        int secenek;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-MENU-");
        System.out.println("1 - Kullanıcı Ekle");
        System.out.println("2 - Kullanıcı Sil");
        System.out.println("3 - Kullanıcı Liste");
        System.out.println("0 - Çıkış");
        secenek = scanner.nextInt();
        switch (secenek){
            case 1:
                database.kullanici_ekle();
                break;
            case 2:
                database.kullanici_sil();
                break;
            case 3:
                database.kullanici_liste();
                break;
            case 0:
                break;
            default:
                System.out.println("Yanlış giriş!");
        }
        if ( secenek != 0 ){
            menu();
        }
    }
}
