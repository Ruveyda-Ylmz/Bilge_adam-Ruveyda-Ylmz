package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(4);
        numberList.add(11);
        numberList.add(4);

        System.out.println("Before sort"+numberList);
        Collections.sort(numberList); //doğal sıralama(küçükten büyüğe)
        System.out.println("After sort"+numberList+"\n");

        System.out.println("Before sort"+numberList);
        Collections.sort(numberList,Collections.reverseOrder()); //reverseOrder() ->büyükten küçüğe sıralar (sort u tersliycek)
        System.out.println("After reverseOrder"+numberList+"\n");

        System.out.println("Before "+numberList);
        numberList.sort(Collections.reverseOrder()); //yukarıda kitersleme işlemi ile aynı işlemi yapar (yöntem2)
        System.out.println("After "+numberList+"\n");

        System.out.println("size: "+numberList.size()+"\n");

        ArrayList numberList2 = (ArrayList) numberList.clone(); //obje idi ArrayList e küçültük ,(ArrayList) bunu için var
        System.out.println("clone List "+numberList2+"\n"); //listin güncel halini tutar

        ArrayList<Integer> numberList3 = numberList;
        System.out.println("Asigment List: "+numberList3+"\n");

        System.out.println("Contains 1?"+numberList.contains(1)+"\n"); //içeriyor mu
        System.out.println("Contains 4?"+numberList.contains(4)+"\n");
        System.out.println("isEmpty? "+numberList.isEmpty()+"\n"); //boş mu (boolen)

        List<Integer> numberList4 = new ArrayList<>();
        System.out.println("is Empty? "+numberList4.isEmpty()+"\n"); //boş mu (boolen)

        System.out.println("index of 4: "+numberList.indexOf(4)+"\n"); //4 var mı ,var ise ilk bulduğu 4 dü ve index numarsını verir
        System.out.println("index of 2: "+numberList.indexOf(2)+"\n"); // 2 var mı ,yok ise -1 döner

//      HATALI BİR KULLANIM NUMBER IN  İLK 11 DÖNMESİNİN SEBEBİ İLK DEĞER 11 ARTTIRMAZ
//        Integer size= numberList.size();
//        for (Integer number: numberList) {
//            // i++;
//            if (number <= size) {
//                System.out.println("liste: " + numberList.get(number));
//            } else {
//                break;
//            }
//        }

            for(Integer number :numberList){
                System.out.println("number: "+number);
            }






    }
}
