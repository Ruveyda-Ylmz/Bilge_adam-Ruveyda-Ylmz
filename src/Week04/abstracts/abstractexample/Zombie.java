package Week04.abstracts.abstractexample;

public class Zombie extends Enemy{ //zombi düşmanı

    public Zombie(){
        this.health=100;
        this.damage=5;
    }

    @Override
    public void attack() {
        System.out.println("Zombie atacks with "+ damage+" damage ");
    }
}
