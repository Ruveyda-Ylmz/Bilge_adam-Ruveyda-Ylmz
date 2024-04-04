package week03.Constructor;

public class Main {
    private String name;
    Main(){
        System.out.println("Constructor Called..."); //"Oluşturucu Arandı"

        name = "Constructor name field."; //"yapıcı adı alanı."
    }
    public static void main(String[] args) {

        Main obj = new Main();
        Main obj2 = new Main();

//        obj.name ="Constructor name field.";
//        obj2.name="Constructor name field.";
        System.out.println("The name is : " + obj.name+"\nThe second name is : " + obj2.name);
    }
}
