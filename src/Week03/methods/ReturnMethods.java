package Week03.methods;

public class ReturnMethods {
    //dönüş paremetreli method(return method)
    //dönüş tipi int dir
    public static void main(String[] args) {
        int sum =sum(5,10);
        System.out.println(sum);

    }
    public static int sum(int number1,int number2){
        return number1+number2;
    }
}
