package Week03.arrays;

import java.util.Scanner;

public class ScannerNextProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasini gir: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("adını gir: ");
        String name =scanner.nextLine();

        System.out.println(age + " "+ name);

        System.out.println("yas gir: ");
        int age2 =Integer.parseInt(scanner.nextLine());
        System.out.println(age2);


    }
}
