package Week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample05 {
    public static void main(String[] args) {
        //TreeMap verileri sıralı saklar
        //doğal sıralama ile yani küçükten büyüğe ama burda harf olarak
        TreeMap<String,Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        evenNumbers.put("Eight",8);
        System.out.println("TreeMap: "+evenNumbers);

        //TreeMap üzerinden HashMap oluşturmak.
        HashMap<String,Integer> numberHashMap = new HashMap<>(evenNumbers);
        System.out.println("HashMap: "+numberHashMap);
    }
}
