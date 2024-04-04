package week03.exceptions;

public class UncaugnException {
    public static void main(String[] args) {
        UncaugnException uncaugnException = new UncaugnException();
        String name =null;
        uncaugnException.method1(name);
    }
    public void method1(String name){
        System.out.println("method1");
        try{
            method2(name);
        }catch (NullPointerException e){
            System.out.println("Caught NPE");
        }
        System.out.println("method1 worked!");
    }

    public void method2(String name) {
        System.out.println("method2");
        method3(name);
        System.out.println("method2 didn't work");
    }

    public void method3(String name) {
        System.out.println("method3");
        name.toUpperCase(); //hata alınan yer
        System.out.println("method3 dind't work");
    }


}
