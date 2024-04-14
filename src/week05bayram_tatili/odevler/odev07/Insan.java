package week05bayram_tatili.odevler.odev07;

import java.util.Scanner;

public class Insan {

    public static String insan_secim;
    public static int i_skor ;
    public static int i_secim(){
        int secim;

        System.out.println("seçim yapınız: \n" +
                           "1-TAŞ  \n"+
                           "2-KAĞIT  \n"+
                           "3-MAKAS  \n");

        Scanner scanner = new Scanner(System.in);
        secim = scanner.nextInt();


        switch (secim){
            case 1:  insan_secim = "taş";
                break;
            case 2:insan_secim = "kağıt";
                break;
            case 3: insan_secim = "makas";
                break;
            default:
                System.out.println("geçersiz seçim"); break;
        }

        return secim;
    }


}
