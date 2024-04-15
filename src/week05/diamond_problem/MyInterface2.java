package week05.diamond_problem;

public interface MyInterface2 {
    public  default void  defaultMethod(){
        System.out.println("MyInterface2 defaultMethod");
    }

    abstract  void test();
}
