package week05.diamond_problem;

public interface MyInterface1 {
    public  default void  defaultMethod(){
        //default heryerde aynı çalışır demek
        System.out.println("MyInterface1 defaultMethod");
    }

    abstract  void test(); //abstract method,gövdesiz
}
