package week05bayram_tatili.odevler.odev09;

public class Muhendis extends Calisan{
    Muhendis(){

    }
    Muhendis(String isim,String soyisim,int maas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        unvan_ata(this.maas);
    }
    @Override
    public void zam_yap(int zamoran) {
        this.maas = this.maas + ( this.maas * zamoran ) + 250;
        unvan_ata(maas);
    }

    @Override
    public void unvan_ata(int maas) {

        if (maas < 10000) {
            this.unvan = "Stajyer Mühendis";
        }else if (maas >= 10000 && maas< 12000){
            this.unvan = "Mühendis";
        }else if (maas >= 12000 && maas<=17000){
            this.unvan = "Kıdemli Mühendis";
        }else if (maas > 17000 ){
            this.unvan = "Uzman Mühendis";
        }
    }

}
