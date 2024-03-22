package hafta02;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int say, deger, sayac=0;

        System.out.println("lütfen sayi giriniz: " );
        say = scanner.nextInt();
        deger = say;

        if (say > 1) {
            for (say = deger; say > 0; say--) {
                if (say%2 ==0) {
                    sayac++;
                }
            }

        }else {
            for (say=deger ; say <0 ; say++){
                if(say%2==0){
                    sayac++;
                }
            }
            }
        System.out.println(sayac);
        }
    }

