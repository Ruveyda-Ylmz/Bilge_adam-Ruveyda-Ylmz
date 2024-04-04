package week04.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample03 {
    public static void main(String[] args) {

        TreeMap<Integer,String> numberMap = new TreeMap<>();
        numberMap.put(3,"tree");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");
        numberMap.put(5,"five");
        numberMap.put(9,"nine");
        numberMap.put(8,"eight");
        System.out.println("\nBefore Headmap: "+numberMap); //yzarken doğal sıralama yapacak

        System.out.println("\nHeadMap() ");
        Map<Integer,String> heapMap =numberMap.headMap(7);
        System.out.println("After heapMap(3) : "+heapMap);

        Map<Integer,String> heapMapWithBoolen =numberMap.headMap(7,true);
        System.out.println("After heapMap(7,true) : "+heapMapWithBoolen);

        System.out.println("\nBefore TailMap : "+numberMap); //kuyruk
        Map<Integer,String> tailMap =numberMap.tailMap(7);
        System.out.println("After tailMap(7) : "+tailMap);

        Map<Integer,String> tailMapWithBoolean =numberMap.tailMap(7,false);
        System.out.println("After tailMap(7,false) : "+tailMapWithBoolean);

        System.out.println("\nBefore subMap : "+numberMap);
        Map<Integer,String> subMap =numberMap.subMap(3,7);
        System.out.println("after subMap(3,7) : "+subMap); //default :((3)true,(7)false) o yüzden 3 dahil 7 dahil değil

        Map<Integer,String> subMapWithBoolen =numberMap.subMap(3,false,7,true);
        System.out.println("After subMap(3,false,7,true) : "+subMapWithBoolen);



    }
}
