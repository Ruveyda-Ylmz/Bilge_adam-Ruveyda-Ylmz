package week04.abstracts.abstractexample;

public abstract class Enemy { //düşman

    int health; //sağlık
    int damage; //zarar

    public abstract void attack(); //her düşmanın atağı farklı olabilir

    public void takeDamage(int damage){ //hasar alma
        health = health-damage;
        System.out.println("enemy is damaged: "+damage);
        System.out.println("enemy health is: "+health);

        if(health<=0){
            System.out.println("enemy is defeated. -is killed.");

        }
    }
}
