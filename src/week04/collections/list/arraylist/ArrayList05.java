package week04.collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("JavaA","c^#","C++");

        nameList.replaceAll(String::toUpperCase); //(aldığım değişken tipi:: )
        System.out.println(nameList);

        for (String name : nameList){
          //  nameList.set(nameList.indexOf(name),nameList.toUpperCase());
        }
    }
}
