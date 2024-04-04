package Week04.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {

        TreeMap<Integer,String>numberMap = new TreeMap<>();
        numberMap.put(3,"tree");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");
        numberMap.put(5,"five");
        numberMap.put(9,"nine");
        numberMap.put(8,"eight");
        System.out.println("Beginning: "+numberMap); //yzarken doğal sıralama yapacak

        System.out.println("\nhigher"); //daha yüksek
        System.out.println("higherKey(5): "+numberMap.higherKey(5)); //beşten daha büyük en büyük sayı
        System.out.println("higherEntry(5): "+numberMap.higherEntry(5));


        System.out.println("\nLower"); //daha düşük
        System.out.println("lowerKey(5): "+numberMap.lowerKey(5)); //5 den daha küçük en büyük sayı
        System.out.println("lowerEntry(5): "+numberMap.lowerEntry(5));

        System.out.println("\nCeiling Function: "); //tavan fonksiyon
        System.out.println("ceilingEntry(4) : " +numberMap.ceilingEntry(4) );
        System.out.println("ceilingKey(4) : " +numberMap.ceilingKey(4) );
        System.out.println("ceilingEntry(5) : " +numberMap.ceilingEntry(5) );

        System.out.println("\nfloor Function "); //kat fonksiyonu
        System.out.println("floorEntry(5) : "+numberMap.floorEntry(5));
        System.out.println("floorEntry(4) : "+numberMap.floorEntry(4));

        System.out.println("\n Before poll methods : "+numberMap);

        Map.Entry<Integer,String>removedEntry = numberMap.pollFirstEntry();
        System.out.println("\nafter pollFirstEntry() :  "+numberMap);
        System.out.println("removed entry : "+removedEntry);
    }
}
