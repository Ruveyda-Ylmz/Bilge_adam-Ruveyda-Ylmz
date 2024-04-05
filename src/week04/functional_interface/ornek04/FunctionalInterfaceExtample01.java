package week04.functional_interface.ornek04;

public class FunctionalInterfaceExtample01 {

    public static void main(String[] args) {
        Mathoperation addition = (a,b) -> a+b;
        Mathoperation subtraction = (a,b) -> a-b;
        Mathoperation multiplication = (a,b) -> a*b;
        Mathoperation division = (a,b) -> a/b;

        //Lamda expression kullanarak işlem yapma
        System.out.println("10 + 5 = "+operate(10,5,addition));
        System.out.println("10 - 5 = "+operate(10,5,subtraction));
        System.out.println("10 * 5 = "+operate(10,5,multiplication));
        System.out.println("10 / 5 = "+operate(10,5,division));

    }
    private  static int operate(int a,int b,Mathoperation mathoperation){
        return mathoperation.operate(a,b);
    }
}
