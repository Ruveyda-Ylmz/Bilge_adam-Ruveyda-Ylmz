package week05bayram_tatili.odevler.odev06;
public class SayiKontrol {

    public static boolean sayikontrol(String deger){
        char[] degerler;
        degerler = deger.toCharArray(); //gelen string değeri char şeklinde yazacak(15 -> 1 5)
        boolean kontrol = false;
        int sayac = 0;

        for(char dgr: degerler){
            if (dgr == '-' && sayac == 0) {  //ilk değer - ise değer eksi(-) değerdir.
                sayac++;
                continue; //döngü başına git
            }
            kontrol = Character.isDigit(dgr); //sayı mı değil mi

            if (kontrol == false) {
                break;
            }
        }
        return kontrol;
    }
}
