package week04.generics;

public class GenericMethodExample {

    public static <T> void printArray(T[] array) {
        for (T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] integerArrays = {1,2,3,4,5};
        Double[] doubleArrays = { 1.2,3.2,12.5};
        String[] stringArrays = {"apple","banana","pineapple","cherry","watermelon"};

        System.out.println("Integer array");
        printArray(integerArrays);

        System.out.println("Double array");
        printArray(doubleArrays);

        System.out.println("String array");
        printArray(stringArrays);



    }
}
