package Week04.enums;

public class Test {

    Size pizzaSize;

    public Test(Size pizzaSize){
        this.pizzaSize=pizzaSize;
    }

    public void orderPizza(){
        switch (pizzaSize){
            case SMALL:{
                System.out.println("ı order a small size pizza");
                break;
            }
            case MEDIUM:{
                System.out.println("ı order a MEDIUM size pizza");
                break;
            }
            case LARGE:{
                System.out.println("ı order a LARGE size pizza");
                break;
            }
            case EXTRALARGE:{
                System.out.println("ı order a EXTRALARGE size pizza");
                break;
            }
            default:{
                System.out.println("I dont know whick size to order");
            }

        }
    }
}
