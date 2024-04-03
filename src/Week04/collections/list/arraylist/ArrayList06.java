package Week04.collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList06 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4);
        numberList.replaceAll(number->number*2); //lambda expression / -> pointer
        System.out.println(numberList);

        //yukarıda ki işlem ile aynı sadece çıktıyı tersten yazdırır
//        for (Integer number : numberList){
//            numberList.set(numberList.indexOf(number),number*2);
//        }
//        System.out.println(numberList);

    }
}
