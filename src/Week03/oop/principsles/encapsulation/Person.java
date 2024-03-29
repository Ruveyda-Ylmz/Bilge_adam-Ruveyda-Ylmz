package Week03.oop.principsles.encapsulation;

public class Person {

    //en capsulation - getter/setter den oluşur

   private String name;

   private String lastname;

    private  int age;

    private String tcKimlik;

    //YAZIM SIRALAMA KURALI
    //Constructor
    //userDefinedMethods
    //getter-setter
    //toString method


    public String arabaSur(){
        if (age>=18){
            return name + "arabayi suruyor.";
        }else{
            return "araba sureye yasin tutmuyor";

        }

    }


    //sağ tıkla "Generate"ye tıkla "getter and setter" a tıkla istediğin değişkenlerin get ve set değerleri otomatik tanımlansın
    //get->ekrana basmada kullanılır
    //set ->değer atamda kullanılır




    public void setTcKimlik(String tcKimlik) {  //get kısmını sildik çünkü tc ekrana basılmaz özeldir
        this.tcKimlik = tcKimlik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            this.age=age;
            System.out.println("yaş sıfırdan az olamaz");
        }else if (age<=18){
            this.age=age;
            System.out.println("yasin tutmuyor");
        }else{
            this.age=age;
            System.out.println("tekrikler yasin tuttu kullan arabayi."+"\n"+arabaSur());
        }

    }
}
