package week04.finalexamples.ornek05;

public class FinalStaticExample {

    private  static final String COLON =":";
    private  static final String COMMA  =",";
    private  static final String DOT =".";

    public static void main(String[] args) {
        String uuid = "123456";
        String request= "123456";

        System.out.println("string count");
        System.out.println(uuid.concat(COLON).concat(request)); //connat -<birleştirme işlemi yapar

        System.out.println("String builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(uuid).append(COLON).append(request)); //ekleme yapar,string türünde ekleme yapar .
        // heapde eklemez ama mutasyona uğratmış olur

        String programmingLang  ="java,.net ,python";
        String[] programmingLangArr = programmingLang.split(COMMA); //regex olarak elden de "," de yazılabilir ama değişke olarak tanımlamak daha mantıklıdır.
        for (String lang : programmingLangArr){
            System.out.println(lang);
        }


    }

}
