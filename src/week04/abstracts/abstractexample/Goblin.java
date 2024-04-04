package week04.abstracts.abstractexample;

public class Goblin extends Enemy { //goblin düşmanı

    public Goblin(){
        this.health=50;
        this.damage=10;
    }
    @Override
    public void attack() {
        System.out.println("Goblin attacks with "+damage+" damage ");
    }
}
