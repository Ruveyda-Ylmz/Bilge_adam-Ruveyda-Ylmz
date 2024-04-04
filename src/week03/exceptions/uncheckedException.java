package week03.exceptions;

public class uncheckedException {
    public static void main(String[] args) {
        //runtime hataları yani çalışma zamnında gerçekleşen hatalar

        String name =null;

        //kötü yaklaşım
        try{
            if (name.equals("ruveyda")){
                System.out.println("name : ruveyda");
            }
        }catch (NullPointerException e){
            System.out.println("catch");
        }

        //name!=null burda hata vermez ama
        //name.equals("ruveyda")  burda hata verir
        if(name!=null && name.equals("ruveyda") ){
            System.out.println("name : ruveyda");
        }

        //sorgu hata vermez
        if ("ruveyda".equals(name)){
            System.out.println("name : ruveyda");
        }
        //null değerler sadece objelere verilebilir
    }

}
