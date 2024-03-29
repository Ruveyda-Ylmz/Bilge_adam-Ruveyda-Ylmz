package Week03.oop.principsles.inheritance;
public class Dog extends Animal{
        public void display(){

        System.out.println("may name is "+name);
    }

   //    public void eat(){ //method overriding
    //        System.out.println("dog can eat");
     //  }

    //sağ tıkla generate ye tıkla ovirride method a tıkla
    @Override //ezmek
    public void eat() { //method overiding
       // super.eat(); //superlass danki eat()methodu
       // this.eat(); //bu sınıfta ki eat()methodu
        System.out.println("dog can eat");
    }
}

