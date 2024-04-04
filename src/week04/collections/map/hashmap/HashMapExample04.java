package week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample04 {
    public static void main(String[] args) {

        HashMap<Integer,String> languageHashMap =new HashMap<>(); //(key,value)
        languageHashMap.put(1,"java");
        languageHashMap.put(2,"Python");
        languageHashMap.put(3,"JS");
        languageHashMap.put(4,"JS");
        System.out.println("HashMap: "+languageHashMap);

        //anahtarlar üzerinden iterasyon
        System.out.println("ıteration through keys");
        for (Integer key : languageHashMap.keySet()){
            System.out.print(key);
            System.out.print(",");
        }

        //değerler üzerinden iterasyon
        System.out.println("ıteration through values");
        for (String value : languageHashMap.values()){
            System.out.print(value);
            System.out.print(",");
        }

        //anahtar/deger çifti üzerinden iterasyon
        System.out.println("ıteration through key/value pairs"); //entry her seferinde çift olaarak değer alıcak
        for (Map.Entry<Integer,String> entry:languageHashMap.entrySet()){
            System.out.println(entry);

        }

    }
}
