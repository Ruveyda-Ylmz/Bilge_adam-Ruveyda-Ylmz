package week05bayram_tatili.odevler.odev07;

import java.util.Random;

public class Bilgisayar {

    public static String bilgisayar_secim;
    public  static int b_skor;
    public  static int b_secim(){

        int secim;
        Random random = new Random();
        secim = random.nextInt(1 ,3);
        switch (secim){
            case 1:  bilgisayar_secim = "taş";
                break;
            case 2: bilgisayar_secim = "kağıt";
                break;
            case 3: bilgisayar_secim = "makas";
                break;
        }

       return  secim;
    }
}
