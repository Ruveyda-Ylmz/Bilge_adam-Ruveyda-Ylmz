package week05bayram_tatili.odevler.odev08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private static List<Kullanici> kullanici_vt = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void kullanici_ekle(){
        int id;
        String isim,email,sifre;
        Boolean kontrol = true;

        System.out.println("ID(Sayı) giriniz: ");
        id = scanner.nextInt();

        for (Kullanici kullanici1 : kullanici_vt ){
            if (kullanici1.getId() == id){
                kontrol = false;
                break;
            }
        }

        if ( kontrol ){
            System.out.println("İsim giriniz: ");
            isim = scanner.next();

            System.out.println("Email giriniz: ");
            email = scanner.next();

            System.out.println("Şifre giriniz: ");
            sifre = scanner.next();

            Kullanici kullanici = new Kullanici();
            kullanici.setId(id);
            kullanici.setIsim(isim);
            kullanici.setEmail(email);
            kullanici.setSifre(sifre);

            boolean giris = kullanici_vt.add(kullanici);

            if ( giris ){
                System.out.println("İşlem Başarılı.");
            } else {
                System.out.println("Veri eklenemedi hata!");
            }
        }else {
            System.out.println("Girdiğiniz ID ile kullanıcı bulunmaktadır!");
        }



    }
    public static void kullanici_liste(){
        if ( kullanici_vt.size() == 0 ){
            System.out.println("Liste Boş!");
        }else {
            for (Kullanici kullanici : kullanici_vt) {
                System.out.println( "ID: "    + kullanici.getId()    + "\n" +
                                    "İsim: "  + kullanici.getIsim()  + "\n" +
                                    "Email: " + kullanici.getEmail() + "\n" +
                                    "Şifre: " + kullanici.getSifre() + "\n");
            }
        }
    }
    public static void kullanici_sil(){
        boolean kontrol = false;
        int id,sayac=0;

        System.out.println("ID Giriniz: ");
        id = scanner.nextInt();

        if ( kullanici_vt.size() == 1 ){
          Kullanici klnc = kullanici_vt.get(0);
          if (klnc.getId() == id){
              kullanici_vt.remove(0);
              kontrol = true;
          }
        }else {
            for (Kullanici kullanici : kullanici_vt) {
                if (kullanici.getId() == id) {
                    kontrol = true;
                    kullanici_vt.remove(sayac);
                }
                sayac++;
            }
        }
        if (kontrol){
            System.out.println("Silme işlemi başarılı.");
        }else {
            System.out.println(id + " ID'li bir kullanıcı bulunmamaktadır!");
        }
    }
}
