package hafta02;

public class AritmetikOperator {

    public static void main(String[] args) {
        
        int number1 = 25;
        int number2 = 3;
        int number3 = 17;
        
        String websiteName = "Web Sitemiz:" ;
        String websiteUrl = "www.bilgeadam.com";

        //sout enter 'println'i acar
        System.out.println("Merhaba!\n"+websiteName + websiteUrl+" bosluk");

        //ekle - cikar
        System.out.println("a=" + number1 + " " + "b=" + number2 + " " + "c=" + number3);
        System.out.println("a + b = " + (number1+number2)); //sout+enter
        System.out.println("a - c = " + (number1-number3));
        System.out.println("a * b = " + (number1*number2));
        System.out.println("a / 5 = " + (number1 / 5));


        //mod alma
        System.out.println("c % b= " + (number3%number2));





    }
}
