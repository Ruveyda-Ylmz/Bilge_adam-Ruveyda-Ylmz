package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Arraylist sınıfını kullarak birliste elde ettik listemize elemanlar ekledik
        List<Integer> numberList =new ArrayList<>(); //constructor
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        System.out.println("list: "+numberList);
        System.out.println("index: "+numberList.get(2));

        int number = numberList.get(2);
        System.out.println("index: "+number);

        int removedNumber = numberList.remove(1);
        System.out.println("removedNumber: "+removedNumber);
        System.out.println("list: "+numberList);
    }
}
