package Week04.wrapper;

public class Wrapper {
    public static void main(String[] args) {


        //ilk harfler wrapper de büyük yazılır
        //string türünde hepsini aldığı için tırnaklı yazım fark etmiyor
        System.out.println("---Boolen----");
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true"); //kırmızı yanmasının sebebi ileride değiştirilecek olması
        Boolean b3 = new Boolean("bilge");
        Boolean b4 = new Boolean("tRue");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("---Byte----");
        Byte byte1 = new Byte((byte)5);
        Byte byte2 = new Byte("50");

        System.out.println(byte1);
        System.out.println(byte2);

        System.out.println("\n"+"---Integer----");
        Integer integer1 = new Integer(20);
        Integer integer2 = new Integer("50"); //numerik string değer girilmesi
        Integer integerSum = integer1 + integer2;
        int number1 =10;
        int number2 = 20;
        Integer intSum = number1+ number2;

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integerSum);
        System.out.println(intSum);

        System.out.println("\n"+"---Long----");
       // Long long1 = 100; //hata verir
        Long long2 = (long)100;
        Long long3 = 100L;
        long primitiveLong = 100;

        System.out.println(long2);
        System.out.println(long3);
        System.out.println(primitiveLong);


        System.out.println("\n"+"---Character----");
        Character character1 = new Character((char) 66); //B
        System.out.println(character1);

        Character character2 = new Character ((char) (65+32)); //a(97)
        System.out.println(character2);

        Character character3 = new Character('A');
        System.out.println(character3);

        System.out.println("AAA"+"AAA"); //(65+65+65) + (65+65+65) = 390

        System.out.println();



    }

}
