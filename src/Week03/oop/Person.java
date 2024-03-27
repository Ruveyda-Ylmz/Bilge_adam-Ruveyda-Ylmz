package Week03.oop;

public class Person {
    //başka sınıfta çalışmka için açıldığından main tanımlanmaz

    String nickname;
    String name;
    String gender;

    public  void sleep(){ //method
        System.out.println(name + "is sleeping");
    }

    public void walk(){
       System.out.println(name + "is walking");
    }
}
