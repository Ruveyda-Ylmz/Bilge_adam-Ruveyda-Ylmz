package week03.methods.asalsayisoru;

public class PrimeNumberCalculator {

    long number; //bu ifade PrimeNumberCalculator sınıfının bir field'dir (field=alan).
                 /*değişkenin veri türü herhangi bir primitive type, yada herhangi bir class da olabilir.
                  or: Scanner scanner = new Scanner(System.in);
                 - burada veri türü solda ki "Scanner" class'ıdır.
                  "scanner" ise oluşturduğumuz değişkene kodumuzda hangi isimle sesleneceğimizi belirtir.
                  sağ tarafta ise "=" atama operatoru aracılığı ile değişkenimize atadığımız değeri barındırıyor.

                  -new Scanner(System.in) -> ,ifadesi aslında Scanner sınıfının bir yapıcı methodudur.
                  Scanner yapıcı metodu içerisine System.in türünde bir paremetre almadan benim için bir
                  scanner nesnesi oluşturmuyor.

           -bir sınıfın içerisine sonsuz sayıda field/attribute barındırabilir.
           dikkat edilemsi gereken tek şey; bu fieldların isimlerinin birbirine çakışmamasıdır.

           -bir field ya da sıradan bir method nasıl isimlendirilir?
           ilk kelimenin başlangıç hargi küçük olmalıdır.
           sonrasında gelen her kelime için baiş harfi büyük  yazılmalı.

            String plakano; ->ilk kelimenin ilk harfi küçük başlar,sonrasında bütün kelimelerin ilk harfi büyük
            harfle yazılır.bu sayade boşluk tuşu(space) kullanmdan kelimelri birbirinden ayırt etmesi okuması kolay olur.

            public int sayiTopla(int sayi1 , int sayi2) ->bu sıradan bir metot olduğu için
            (yani bir constructor metodu olmadığı için) isminin ilk harfi küçük harfle başlar


                  */


    /*Constructor:
    1-constroctor methodunun ismi sınıfın ismiyle aynı olmalıdır
    2-paremetreler için () uygulanmalı. bu sayede method olduğu da JVM tarafından anlaşılır
    3-constructor methodları  geri dönüşüm tipi olmdığı için normal methodlara göre bir geri
     dönüş tipi belişrtilmez.dolayısıyla herhangi bir koşulda  "return" de kullanılmaz
    4-geri dönüş tipi olmasa da , Acces modifier kullanabiliriz.
     4.1 -Acces modifier public ise ilgili method/field  ya da class a projenin herhangi bit
         yerinden erişebilirim.
     4.2.2- Acces modifier private ise ilgili metot ya da field e sadece ve sadece method ve
           field ın tanımlandığı sınıfta erişebilirim.
     4.1.3-Acces modifier default ise (yani hiçbir şey belirtilmediyse-kendiliğinden default olur)
          method ve field sadece bulundukları  sınıf ile aynı pakette bulunan diğer sınıflar erişebilir.
     5-her methot da olduğu gibi,constructor methodunun da gövdesi "{}" bulunmak zorunda.
     6-constructor methodu sınıfın yapıcı metodudur,sınıfın bir nesnesini oluşturmak için kullanılır.
     */

    /* hiçbir şey yazamadığım için access modifier'ı default oldu.dolayısıyla bu constructor
    methoduna sadece bu sınıfın bulunduğu pakette bulunan sınıflar erişebilir.
     */




    //constructor
    PrimeNumberCalculator(){ //() -> parametre/argüman kısmı burası,
                            // buraya string  isim,int sayi gibi değerler girilir)

        //Herhangi bir parametre girilmeyen constructorlara
        // NoArgsConstructor(Argümansız/Parametresiz) constructor denir.

    }


    PrimeNumberCalculator(long number){
         /*constructor :Bu sınıfın bir nesnesi oluşturulurken dışarıdan bir sayının parametre olarak girilmesi durumunda,
         bu constructor çalışacaktır. Yukarıda parametre olarak aldığım number değişkenini bir alt satırda
         number isimli field'ıma değer olarak atıyorum. Bu şekilde olan constructorlara Parametreli Constructor
         (Parameterized Constructor) denir. Argüman alarak nesne üretmek için kullanılır.*/

        this.number=number; //buradaki this. ifadesi, sınıfın değişkeni olan number'a seslendiğimi ifade eder.

    }


    public/*access modifier*/ boolean/*geri dönüş tipi*/ asalSayiMi /*metot ismi*/()/*parametre alanı*/{/*Metot gövdesi*/
        if(number == 2){
            return true;
        } else if(number <2 || number%2 ==0){/*Birbirine bağlı, zincirleme karar yapısı için else-if kullandık.*/
            return false;
        } else {
            for (long i = 3; i< number/2;i+=2){
                if(number%i == 0){
                    System.out.println(i);
//                    System.out.println((number%i));
                    return false;
                }
            }
            return true;
        }
    }

    //kodun daha sadeleşmiş hali
    public boolean asalSayiMiOptimize (){
        long sqrt = (long) Math.sqrt(number);
        if(number == 2){
            return true;
        } else if(number <2 || number%2 ==0){/*Birbirine bağlı, zincirleme karar yapısı için else-if kullandık.*/
            return false;
        } else {
            for (long i = 3; i<= sqrt/2;i+=2){
                if(number%i == 0){
                    System.out.println(i);
//                    System.out.println((number%i));
                    return false;
                }
            }
            return true;
        }
    }

}
