package hafta02;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner giris = new Scanner(System.in);

        //Scanner.nextNet(), scanner.nextLong(), scanner.nextDouble()
        //scanner.nextFloat(),scanner.nextLine();
        int sayi;
        int sgris;

        System.out.println("lütfen bir sayi giriniz: ");
        sayi = scanner.nextInt();
        sgris = giris.nextInt();

        System.out.println(sgris);
        System.out.println(sayi);
    }
}
