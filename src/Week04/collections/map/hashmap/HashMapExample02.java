package Week04.collections.map.hashmap;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer,String> languageHashMap =new HashMap<>(); //(key,value)
        languageHashMap.put(1,"java");
        languageHashMap.put(2,"Python");
        languageHashMap.put(3,"JS");
        languageHashMap.put(4,"JS");
        System.out.println("HashMap: "+languageHashMap.get(2));

        //belirli bir key e denk gelen value yi döndürür.
        String value = languageHashMap.get(2);
        System.out.println("value at key 2: "+value);

        //keyleri bir set olarak dönme -> keySet()
        System.out.println("Keys: "+languageHashMap.keySet());

        //value ları bir set olarak dönme -> values()
        System.out.println("value: "+languageHashMap.values());

        //key/value pair (çift)ini bir set olarak dönmek
        System.out.println("key/value mapping: "+languageHashMap.entrySet());

        //key varsa valuesini dön yoksa default da not fount dön
        String value1 = languageHashMap.getOrDefault(5,"not fount");
        System.out.println("value for key 5: "+value1);


        String value2 = languageHashMap.getOrDefault(1,"not fount");
        System.out.println("value for key 1: "+value2);


        //bir key var mı diye kontrol eder
        if (languageHashMap.containsKey(2)){
            System.out.println("map containskey value of: 2");
        }else {
            System.out.println("key not fount");
        }

        if (languageHashMap.containsKey("jav")){
            System.out.println("map containskey value of java");
        }else {
            System.out.println("not such value.");
        }

        //bir key ile ilişkili value yu değiştirmek
        System.out.println("orginal HashMap: "+languageHashMap);

        languageHashMap.replace(4,"Swift");
        System.out.println("hashMap after replace(): "+languageHashMap);

        //bütün value değerlerini uppercase çevirmek
        languageHashMap.replaceAll((K,V) -> V.toUpperCase() );
        System.out.println("updated HasMap: "+ languageHashMap);

        //bir HashMap den öğeleri kaldırmak/silmek
        String value3 = languageHashMap.remove(4);
        System.out.println("remode value: "+value3);
        System.out.println("update hashmap : "+languageHashMap);

        //bir hashmap den bir key/value çiftini kaldırmak/silmek
        Boolean isDelete = languageHashMap.remove(3,"JS");
        System.out.println("is delete : "+isDelete);
        System.out.println("update hashmap: "+languageHashMap); //+
    }

}
