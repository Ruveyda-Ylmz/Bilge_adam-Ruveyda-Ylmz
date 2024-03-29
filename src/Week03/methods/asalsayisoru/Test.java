package Week03.methods.asalsayisoru;

public class Test {
    public static void main(String[] args) { /*main metodu kodları çalıştırabilmemiz için kullan bir metottur.*/
        /*PrimeNumberCalculator sınıfının parametresiz bir nesnesini/instance'ını üretiyorum*/

        PrimeNumberCalculator primeNumberCalculatorNoArg = new PrimeNumberCalculator();//Argümansız ürettim.
        primeNumberCalculatorNoArg.number=1; //argümansız ürettiğim için number değerini elle atadım.

        /*PrimeNumberCalculator sınıfının parametreli bir nesnesini/instance'ını üretiyorum*/
        PrimeNumberCalculator primeNumberCalculatorWithArg = new PrimeNumberCalculator(5000001557l);//Sayıyı parametre kısmına, argüman olarak verdim.

        long startTime = System.nanoTime(); // çalışma saniyesi gösterir


        //asalSayiMi() ve asalSayiMiOptimize() yi karşılaştır
        if(primeNumberCalculatorWithArg.asalSayiMi()){
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi degildir.");
        }
        long endTime = System.nanoTime(); //çalışma saniyesi
        long timeElapsed = endTime- startTime; //yukarıda ki kodun kaç saniyede çalıştığını bulmak için

        System.out.println("Programın nano saniye bazında calisma süresi : " + timeElapsed);
        System.out.println("Programın milisaniye bazında calisma süresi : " +(timeElapsed/1000000));


    }
}
