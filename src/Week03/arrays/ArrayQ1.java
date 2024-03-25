package Week03.arrays;

import java.util.Optional;

public class ArrayQ1 {
    public static void main(String[] args) {
        //dizinin toplamı ve ortalması

        double toplam=0;
        int[] dizi ={2,-9,0,5,12,-25,22,9,8,12};

        for (int i:dizi){
            toplam=toplam+(i);
        }
        System.out.println("dizi içi toplam:" + toplam + "\n"+
                           "dizi  ortalamsı:" + toplam/dizi.length);
    }
}
