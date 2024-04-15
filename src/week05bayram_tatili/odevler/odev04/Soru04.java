package week05bayram_tatili.odevler.odev04;

public class Soru04 {
    public static void main(String[] args) {

        int[] sayilar = { 2, -256, 2, 1258, 2, 4};
        int i=1;
        boolean bool = false;

        for (int sayi : sayilar){
            if (sayi == sayilar[i]){
                bool = true;
                break;
            }
            if (i<sayilar.length-1){
                i++;
            }else {
                break;
            }
        }

            System.out.println(bool);
    }
}
