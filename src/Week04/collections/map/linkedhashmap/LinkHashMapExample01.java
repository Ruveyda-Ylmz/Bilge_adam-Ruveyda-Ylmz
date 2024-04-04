package Week04.collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkHashMapExample01 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> nameMap = new LinkedHashMap<>();
        nameMap.put("book","kitap");
        nameMap.put("application","uygulama");
        nameMap.put("apple","elma");
        nameMap.put(null,null); //ikisde string ama değişken karşılığı olmadığından ekrana yazmaz
        nameMap.put(null,"a");
        nameMap.put("null",null);
        nameMap.put("nulll",null); //value değeri null olanlar sırasal olarak en son yazdırılır.
        nameMap.put(null,"b");
        nameMap.put(null,"c");  //key de null olma durumunda son değer sadece yazar (çünkü key çiftlenemez)
        System.out.println("LinkedHashMap : "+nameMap);
        System.out.println("LinkedHashMap : "+nameMap);//-
    }
}
