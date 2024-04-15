package week03.oop;

public class Person {
    //başka sınıfta çalışmka için açıldığından main tanımlanmaz

    String nickname;
    String name;
    String gender; //cinsiyet

    public  void sleep(){ //method ,sleep(uyumak)
        System.out.println(name + "is sleeping");
    }

    public void walk(){ //walk(yürümek)

        System.out.println(name + "is walking");
    }
}
