package hafta02;

public class AtamaOperatoru {
    public static void main(String[] args) {

        byte byteNumber = 126;     //-127....127
        short shortNumber = 327;
        int integerNumber =1058;
        long longNumber = 1058;
        float floatNumber = 42.8f;
        double doubleNumber = 8.52;
        char charNumber = 'A';
        boolean booleanNumber = true;

        //referans veri tipleri
        String myText="Merhaba!";
        String myWeb = "www.bilgeadam.com";

        //ekrana yazdırma programı
        System.out.println(myText + "\n Byte değeri:" + byteNumber +
                                    "\n Short değeri:" + shortNumber +
                                    "\n Integer değeri:" + integerNumber +
                                    "\n Long değeri:" + longNumber +
                                    "\n Float değeri:" + floatNumber +
                                    "\n Double değeri:" + doubleNumber +
                                    "\n Char değeri:" + charNumber +
                                    "\n Boolen değeri:" + booleanNumber +
                                    "\n myWeb: " + myWeb);

        System.out.println(myWeb);

    }
}
