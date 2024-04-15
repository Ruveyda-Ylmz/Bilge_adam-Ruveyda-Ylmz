package hafta02;

public class NestedForloop2 {
    public static void main(String[] args) {

        //yıldız sorusu
        for (int i=1; i<=5 ; i++){
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
