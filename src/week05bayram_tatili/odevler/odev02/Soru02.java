package week05bayram_tatili.odevler.odev02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

       String ulkeler[] = {"Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };

        boolean var =false;

        Scanner scanner = new Scanner(System.in);

        String ulke = scanner.nextLine();

        String deger2;

        ulke.toLowerCase();
        for (String deger : ulkeler){
            deger2 = deger.toLowerCase();
            if (ulke.equals(deger2)){
                System.out.println("girilen ülke ülkeler array'inde vardır");
                var = true;
            }
        }
        if (var==false){
            System.out.println("girilen ülke ülkeler array'inde yoktur");
        }

    }
}
