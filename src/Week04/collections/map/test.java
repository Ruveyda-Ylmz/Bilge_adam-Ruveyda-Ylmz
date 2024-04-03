package Week04.collections.map;

import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        TreeMap<String,Integer> Numbers = new TreeMap<>();
        Numbers.put("java",1);
        Numbers.put("c",2);
        Numbers.put("C++",3);
        System.out.println(Numbers);
        System.out.println(Numbers.firstKey());


    }
}
