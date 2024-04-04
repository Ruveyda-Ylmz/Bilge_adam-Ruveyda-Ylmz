package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(); // davranışlar soldan özellikler sağdan alınır

        nameList.add("ayı");
        nameList.add("arı");
        nameList.add("fare");
        nameList.add("balporsuğu");

        System.out.println(nameList);
    }

}
