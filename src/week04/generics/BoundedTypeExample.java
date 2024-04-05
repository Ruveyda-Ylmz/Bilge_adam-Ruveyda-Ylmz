package week04.generics;

public class BoundedTypeExample {

    public static <T extends Number> void findMinMax (T[] array){ //bu method(Number) sayılar ile kullanmak için tasarlanmıştır

        if(array == null || array.length == 0){
            return;
        }
        T min = array[0];
        T max = array[0];

        for (T element : array){ //T ye rapper class değerleri gelir primite değerler girilmez
            if (element.doubleValue() < min.doubleValue()){
                min = element;
            }
            if (element.doubleValue() > max.doubleValue()){
                max = element;
            }
        }
        System.out.println("min : " +min);
        System.out.println("max : "+max);
    }

    public static void main(String[] args) {

        Integer[] intArr = {1,3,5,-15,75,16};
        Double[] doubleArr = {3.1,1.3,77.123,-16.2332,100.13};
       // String[] strArr = {"ali","ayie","mehmet","ahmet","ferdi","fatma"}; ->çalışmaz

        System.out.println("Integer Array");
        findMinMax(intArr);

        System.out.println("Double Array");
        findMinMax(doubleArr);
    }


}
