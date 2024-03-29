package Week03.oop.principsles.encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("ruveyda");
        p1.setLastname("yilmaz");
        p1.setAge(28);
        p1.setTcKimlik("1254875698");

        System.out.println("isim: "+ p1.getName()+
                           "\nyaş: "+ p1.getAge()+
                           "\nsoyisim: "+ p1.getLastname());

        //(System.out.println(p1.arabaSur());
    }
}
