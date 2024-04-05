package week04.generics;

public class GenericVarArgsExample {

    public static <T> void printArray(T... items){ //T.. birçok türde birden fazla
        for (T item : items){
            System.out.println(item + " ");
        }
        System.out.print(items+" ");
    }

    public static void main(String[] args) {
        System.out.println("string dizisi");
        printArray("merhaba" ,"dünya ","java");

        System.out.println("Integer dizisi");
        printArray(1,2,3,4,5,6,7);

        System.out.println("Double dizisi");
        printArray(3.14,9.80,2.718);
    }
}
