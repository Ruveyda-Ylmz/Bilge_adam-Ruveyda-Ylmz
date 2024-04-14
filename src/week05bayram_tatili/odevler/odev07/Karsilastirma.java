package week05bayram_tatili.odevler.odev07;

public class Karsilastirma {

    public  static  int karsilastir(int b_secim,int i_secim){

        int sonuc =0;
        if (i_secim == b_secim){
            sonuc = 3;
        }
        //1-taş ,2-kağıt ,3-makas
        if ((i_secim == 1 && b_secim == 3) || (i_secim == 2 && b_secim == 1) || ((i_secim == 3 && b_secim ==2))){
            sonuc =1;
        }
        if ((b_secim == 1 && i_secim == 3) || (b_secim == 2 && i_secim == 1) || ((b_secim == 3 && i_secim ==2))){
            sonuc=2;
        }
        return sonuc;

    }
}
