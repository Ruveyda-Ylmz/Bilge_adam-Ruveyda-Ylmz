package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {

        List<String> firistList = new ArrayList<>();
        firistList.add("Java");
        firistList.add("pyhton");

        List<String> secondList = new ArrayList<>();
        secondList.add("Scala");
        secondList.add("kotlin");

        List<String> thirdList = new ArrayList<>();
        thirdList.add("ReactJS");

        firistList.addAll(secondList); //listeye ikinci listede ki değerleri aktarma
        System.out.println(firistList);



    }
}
