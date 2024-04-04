package week03.oop;

public class test {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        System.out.println(className.sayhello("ruveyda"));
        //className.sayhello("ruveya");
        System.out.println(className.sum(1,5));

        ClassName className2 = new ClassName();
        System.out.println(className.sayhello("muuyyzdiiif"));
        System.out.println(className2.sum(8,12));


        //person

        Person p1 = new Person(); //nesne
        p1.name = "ruveyda";
        p1.nickname= "rowi";
        p1.gender ="male";

        p1.sleep();
        p1.walk();

        Person p2 = new Person();
        p2.name ="gamze";
        p2.nickname ="gazo";
        p2.sleep();
        p2.walk();

        System.out.println(p2.nickname);
    }
}
