package week04.collections.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {

    public static void main(String[] args) {
        Deque<String> animalList = new LinkedList<>();

        //iljk indexten Eleman ekleme
        animalList.add("Cow");
        System.out.println("LinkedList: "+animalList);
        animalList.addFirst("dog");
        System.out.println("LinkedList add(): "+animalList);

        //son indexten eleman ekleme
        animalList.addLast("Cat");
        System.out.println("Linkedlist after addLast() : "+animalList);

        //ilk indexten eleman silme
        animalList.removeFirst();
        System.out.println("LinkedList after removedFirst() : "+animalList);

        //son indexten eleman silme.
        animalList.removeLast();
        System.out.println("LinkedList after removedlast() : "+animalList);




    }
}
