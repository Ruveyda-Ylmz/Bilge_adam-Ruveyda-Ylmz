package Week04.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {

        Map<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Ankara",List.of("polatlı","yenimahalle","çankaya","kazan"));
        hashMap.put("İstanbul",List.of("beyoğlu","üsküdar","beylikdüzü"));
        Map<String,Map<String,List<String>>> nestedHashMap =new HashMap<>();
        nestedHashMap.put("Türkiye",hashMap);
        System.out.println(nestedHashMap);



    }
}
