package week04.generics;

public class Main {
    public static void main(String[] args) {

        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("generic class returns : "+intObj.getData());

        GenericClass<String> strObj = new GenericClass<>("java programming");
        System.out.println("generic class returns : "+strObj.getData());


    }
}
