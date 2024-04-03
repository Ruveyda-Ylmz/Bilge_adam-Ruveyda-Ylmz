package Week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("java");
        nameList.add("Python");
        nameList.add("c#");
        System.out.println("List before set: "+nameList);

        //bu şekilde toplu atama yapılır (addAll())
//        List<String> nameList2 = new ArrayList<>();
//        nameList2.addAll(List.of("java","c","c++"));

        //index içi veri değiştirme
        nameList.set(1,"scala");
        System.out.println("List after set: "+nameList+"\n");

        //listenin bir elemanını index ile çıakrm(listeden silme)
        System.out.println("list bfore remove"+nameList);
        nameList.remove(2);
        System.out.println("list after remove"+nameList+"\n");

        //listenin bir elemanın içeriğini çıkarna(listeden silme)
        System.out.println("list bfore remove"+nameList);
        nameList.remove("scala");
        System.out.println("list after remove"+nameList);


    }
}
