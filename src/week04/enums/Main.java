package week04.enums;

import java.util.Arrays;
import java.util.List;

public class Main { //kapsülleme
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);

        Test test = new Test(Size.EXTRALARGE);
        test.orderPizza();

        System.out.println("\n"+"-----ordinal-----");
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.EXTRALARGE.ordinal()); //çıksısı 3 çünkü index değerini verir,(ordinal() methodu bana index değerini verir)

        System.out.println("\n"+"-----ComparaTo-----");
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM)); //0-1=-1
        System.out.println(Size.MEDIUM.compareTo(Size.SMALL)); //1-0= 1
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL)); //3-0=3

        System.out.println("\n"+"-----toString-----");
        System.out.println(Size.EXTRALARGE.toString());
        String str1 = Size.EXTRALARGE.toString();
        if (Size.EXTRALARGE.toString().equals("EXTRALARGE")){ //değiştirilebir değer
            System.out.println("toString equls");
        }

        System.out.println("\n"+"-----name method-----");
        if (Size.EXTRALARGE.name().equals("EXTRALARGE")){ //değiştirilemez değer
            System.out.println("equls name method");
        }

        System.out.println("\n"+"---------valueOf method------");
        if(Size.EXTRALARGE == Size.valueOf("EXTRALARGE")){
            System.out.println("equls valueof method");
        }

        System.out.println("\n"+"---------values method------");
        Size[] sizeAr = Size.values();
        List<Size> sizeList = Arrays.asList(Size.values());

        for (Size size: Size.values()){
            System.out.println(size);
        }

    }
}
