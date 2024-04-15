package week05bayram_tatili.odevler.odev09;

public class OfisCalisan extends Calisan{

    public OfisCalisan(String isim,String soyisim,int maas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        unvan_ata(this.maas);
    }
    @Override
    public void zam_yap(int zamoran) {
        this.maas = this.maas + ( this.maas * zamoran );
        unvan_ata(maas);
    }

    @Override
    public void unvan_ata(int maas) {

        if (maas < 8000) {
            this.unvan = "Stajyer";
        }else if (maas >= 8000 && maas< 12000){
            this.unvan = "Çalışan";
        }else if (maas > 12000 ){
            this.unvan = "Kıdemli Çalışan";
        }
    }

}
