package Week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {

    public static void main(String[] args) {

        //FIFO felsefesiyle çalışır.(First in First out) -> ilk gelen ilk çıkar
        Queue<String> languageQueue = new LinkedList<>();

        languageQueue.add("Python");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("Linkedlist: "+languageQueue);

        //ilk başta ki elemana erişim
        String str1 = languageQueue.peek();//en başta ki elemanı görür
        System.out.println("Acsces Eleman: "+str1);

        //en başdaki elemana erişelim ve aynı zaman da listdene çıkartalım
        String str2 = languageQueue.poll();
        System.out.println("removed element : "+str2);
        System.out.println("LinkedList after poll() : "+ languageQueue);

        //listenin sonuna eleman ekleyelim
        languageQueue.offer("Swift");
        System.out.println("Linkedlist after offer() : "+languageQueue);


    }
}
