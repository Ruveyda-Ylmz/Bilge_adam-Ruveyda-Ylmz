package hafta02;

public class ArttirmaEksiltme {
    public static void main(String[] args) {

        int number1 = 87;
        int number2 = 13;
        boolean condition = true;

        //=! ==

        //ön azaltma toplama
        System.out.println("(A) değeri:" + number1 + "\t(++A) değeri: " + (++number1));
        System.out.println("(B) değeri:" + number2 + "\t(--B) değeri: " + (--number2) + "\n");

        //sonrası arttırma
        System.out.println("(A) değeri:" + number1 + "\t(A--) değeri: " + (number1--));
        System.out.println("(B) değeri:" + number2 + "\t(B++) değeri: " + (number2++) + "\n");
        //17,18 satir once yazar sonra azaltip arttirir

        System.out.println("A değeri = " + number1 + "\tB değeri = " + number2 + "\n");

        //mantıksal değildir operatoru
        System.out.println("değil (!): "+ !condition);
    }

}
