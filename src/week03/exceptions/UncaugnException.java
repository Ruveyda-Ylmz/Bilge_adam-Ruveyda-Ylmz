package week03.exceptions;

public class UncaugnException { //UncaughtException(Yakalanmamış istisna) (runtime hatası)
    public static void main(String[] args) {

        UncaugnException uncaugnException = new UncaugnException();
        String name = null;
        uncaugnException.method1(name);

        //uncaugnException.method(string name) ->nesneden method oluşturduk
    }

    public void method1(String name) { //paremetreli method
        System.out.println("method1");
        try {
            method2(name);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE");
        }
        System.out.println("method1 worked!\n");
    }

    public void method2(String name) {
        System.out.println("Method2");
//        try {
        method3(name);
//        } catch (NullPointerException e){
//            System.out.println("NPE");
//        }

        System.out.println("Method2 didn't work!");
    }


    public void method3(String name) {
        System.out.println("Method3");
        try {
            name.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }
        System.out.println("Method3 didn't work!");


    }
}
