package week04.generics;

public class GenericClassTExtendsA <T extends String>{ //number (string ) yazılsaydı

    public void display(){
        System.out.println("this is a bounded type generic class");
    }

    public static void main(String[] args) {
        GenericClassTExtendsA<String> strobj = new GenericClassTExtendsA<String>();
      //  GenericClassTExtendsA<Integer> intobj = new GenericClassTExtendsA<Integer>(); //:Number sınıfı oluştursaydık hata vermezdi
    // ype parameter 'java.lang.Integer' is not within its bound; should extend 'java.lang.String'
    }
}
