package week05bayram_tatili.odevler.odev05;

public class Soru05 {
    public static void main(String[] args) {
        int  sayilar[] = {1,4,5,6,1,1,4,8};
        int sayac1=0,
            sayac4=0;

        for (int sayi : sayilar){
            if (sayi == 1){
                sayac1++;
            }
            if (sayi == 4){
                sayac4++;
            }
        }
        if (sayac1>sayac4){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
