package Week03.methods.staticmethods;

public class SaticVsNonStatic {
    public static void main(String[] args) {

    }
    public int addNumbers(int a,int b){
        int sum =a+b;
        return sum;
    }

    public static int addNumbers2(int a,int b){
        return a+b;
    }
}
