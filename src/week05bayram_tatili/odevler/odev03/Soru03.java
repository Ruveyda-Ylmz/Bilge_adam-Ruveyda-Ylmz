package week05bayram_tatili.odevler.odev03;

import java.util.Arrays;

public class Soru03 {
    public static void main(String[] args) {

        int sayilar[] = { 120, 130, 125, -256, 16, 1300, 1258, 81, 14 };

        int temp,
            index=1;

        for (int i=0 ; i<sayilar.length;i++){
            for (int j=i+1 ;j<sayilar.length;j++){
                if (sayilar[i] > sayilar[j]){

                }else {
                    temp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j]=temp;
                }
            }
        }

        //System.out.println(Arrays.toString(sayilar));
        System.out.println("en büyük 2.sayı : "+sayilar[index]);


    }
}
