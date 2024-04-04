package week04.finalexamples.ornek03;

public class Person {

    private final String name; //constructor olmazsa hata verir
    private int age;
    public  Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { //set kısmı oluşmaz çünkü değer final
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
