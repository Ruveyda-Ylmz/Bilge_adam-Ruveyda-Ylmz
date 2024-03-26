package Week03.exceptions;

public class HandlingException2 {
    public static void main(String[] args) {

        String name = null;
        //NullPointerException

        try{
            name.toUpperCase();
            System.out.println("try blok içi");
        }catch(NullPointerException e){
            System.out.println("caught NullPointerException!");
           //" e.printStackTrace();//try-catche almasak görünecek hatayı konsola yazdırır.
            System.out.println(e.getMessage()); //hatayı mesaj olarak verir
        }catch (Exception e){
            System.out.println("Cought Exception");
        }finally {
            System.out.println("hatayı yakalayamadim");
        }
        System.out.println("selam");
    }
}
