package week03.methods.staticmethods;

public class SaticVsNonStatic {
    public static void main(String[] args) {
        int sayi = 15;
        int sayi2 = 20;
        SaticVsNonStatic staticVsNonStatic = new SaticVsNonStatic();
        System.out.println(addNumbers2(sayi,sayi2));
        System.out.println(staticVsNonStatic.addNumbers1(sayi,sayi2));
        System.out.println(SaticVsNonStatic.addNumbers2(sayi,sayi2));

    }
    public int addNumbers1(int a,int b){ //non-static
        int sum =a+b;
        return sum;
    }

    public static int addNumbers2(int a,int b){

        return a+b;
    }
}
