package Week04.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {

        TreeMap<Integer,String> numberMap =new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");

        System.out.println("beginning : "+numberMap);

        TreeMap<Integer,String>numberMap2 = new TreeMap<>();
        numberMap2.put(5,"five");
        numberMap2.put(9,"nine");

        System.out.println("beginning: "+numberMap2);

        numberMap.putAll(numberMap2);
        System.out.println("after putAll(): "+numberMap2);

        System.out.println("get(5): "+numberMap.get(5));
        System.out.println("keySet(): "+numberMap.keySet());
        System.out.println("values(): "+numberMap.values());
        System.out.println("entrySet(): "+numberMap.entrySet());
        System.out.println("size(): "+numberMap.size());

        numberMap.remove(1);
        for (Map.Entry<Integer,String>entry : numberMap.entrySet() ){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }

        numberMap.putIfAbsent(3,"uc");
        System.out.println("entrySet() after putIfAbsent(3,'uc') : "+numberMap.entrySet());
        numberMap.putIfAbsent(1,"bir");
        System.out.println("entrySet() after putIfAbsent(1,'bir') : "+numberMap.entrySet());

        numberMap.remove(1,"one");
        System.out.println("entrySet() after remove(1) : "+numberMap.entrySet());

        Integer firstKey = numberMap.firstKey();
        System.out.println( "FirstKey : "+firstKey);
        Integer lastKey = numberMap.lastKey();
        System.out.println("LaskKey : "+lastKey);

        System.out.println("FirstKey entry : "+numberMap.firstKey());
        System.out.println("LaskKey entry : "+numberMap.lastKey());




    }
}
