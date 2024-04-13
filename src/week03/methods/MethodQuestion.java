package week03.methods;

import java.util.Scanner;

public class MethodQuestion {
    /*
    Girilen bir tam sayının karesini alan bir method olusturalim. Bu method non-static olsun.
    Daha sonra kullanıcıdan 2 adet sayi isteyelim. Bu sayilardan kucuk olanindan baslayarak, buyuk olan
    sayiya kadar aradaki butun sayilarin karesini metot yardimiyla alalim ve yazdiralim.
 */
    public static void main(String[] args) {

        MethodQuestion methodQuestion = new MethodQuestion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 1.sayıyı girin : ");
        int num1=scanner.nextInt();
        scanner.nextLine();// "\n"i yutmak için yazılır
        System.out.println("lütfen 2. sayıyı girin : ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int min;
        int max;
        if(num1>num2){
            max=num1;
            min=num2;
        }else{
            max=num2;
            min=num1;
        }

        for (int i=min;i<=max;i++){
            System.out.println(methodQuestion.getSuqare(i));
        }

    }
    public long getSuqare(int number){ //non-static
        return number*number;
    }

}


