package week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        HashMap<String,Integer> languageMap =new HashMap<>();

        //elemanlar ekleyelim
        languageMap.put("java",8);
        languageMap.put("Python",1);
        languageMap.put("JS",3);
        System.out.println("HashMap: "+languageMap);
    }
}
